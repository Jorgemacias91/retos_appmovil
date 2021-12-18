package com.example.festejos_app.Vista;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.festejos_app.R;

import org.osmdroid.config.Configuration;
import org.osmdroid.library.BuildConfig;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

import java.util.ArrayList;


public class Fragment_Sucursales extends Fragment {

    View v;

    private MapView myOpenMapView;
    private MapController myMapController;

    GeoPoint Colombia, Brasil, Paraguay, Argentina, Ecuador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment__sucursales, container, false);
        //-----------------------------------------------------------------------------
        // content...
        myOpenMapView = (MapView) v.findViewById(R.id.openmapview);

        /* ---- necesitamos establecer el valor del agente de usuario en la configuración ------- */
        Configuration.getInstance().setUserAgentValue(BuildConfig.APPLICATION_ID);

        /*   punto de geolocalizacion de ejemplo */
        Colombia = new GeoPoint(3.8296585847259963, -72.81276821924855); // 3.8296585847259963, -72.81276821924855
        Paraguay = new GeoPoint(-23.087611990570114, -58.11157960816864); // -23.087611990570114, -58.11157960816864
        Ecuador = new GeoPoint(-1.2635248697716084, -78.90327729188817); // -1.2635248697716084, -78.90327729188817
        Argentina = new GeoPoint(-34.99158336623606, -64.60014934174679); // -34.99158336623606, -64.60014934174679
        Brasil = new GeoPoint(-8.179374389530565, -57.0619858415168); // -8.179374389530565, -57.0619858415168

        myOpenMapView.setBuiltInZoomControls(true);

        myMapController = (MapController) myOpenMapView.getController();
        myMapController.setCenter(Colombia);
        myMapController.setZoom(6);

        myOpenMapView.setMultiTouchControls(true);

        /* -------------------------------------------------------------------------------------------------- */
        final MyLocationNewOverlay myLocationoverlay = new MyLocationNewOverlay(new GpsMyLocationProvider(getContext()), myOpenMapView);
        myOpenMapView.getOverlays().add(myLocationoverlay); //No añadir si no quieres una marca
        myLocationoverlay.enableMyLocation();

        myLocationoverlay.runOnFirstFix(new Runnable() {
            public void run() {
                myMapController.animateTo(myLocationoverlay.getMyLocation());
            }
        });
        /* -------------------------------------------------------------------------------------------------- */

        /* MARCAS EN EL MAPA */

        ArrayList<OverlayItem> puntos = new ArrayList<OverlayItem>();
        puntos.add(new OverlayItem("Colombia", "Tienda Colombiana", Colombia));
        puntos.add(new OverlayItem("Brasil", "Tienda Brasilera", Brasil));
        puntos.add(new OverlayItem("Argentina", "Tienda Argentina", Argentina));
        puntos.add(new OverlayItem("Paraguay", "Tienda Paraguaya", Paraguay));
        puntos.add(new OverlayItem("Ecuador", "Tienda Ecuatoriana", Ecuador));

        ItemizedIconOverlay.OnItemGestureListener<OverlayItem> tap = new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemLongPress(int arg0, OverlayItem arg1) {
                return false;
            }
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem item) {
                return true;
            }
        };

        ItemizedOverlayWithFocus<OverlayItem> capa = new ItemizedOverlayWithFocus<OverlayItem>(getContext(), puntos, tap);
        capa.setFocusItemsOnTap(true);
        myOpenMapView.getOverlays().add(capa);

        //-----------------------------------------------------------------------------
        return v;
    }
}