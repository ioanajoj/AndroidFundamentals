package com.example.joj.discovercluj;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PlacesList extends Activity {

    List<Location> locationList = new ArrayList<>();
    private RecyclerView theRecyclerView;
    private RecyclerView.Adapter theAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        theRecyclerView = (RecyclerView) findViewById(R.id.the_recycler_view);

        // specify an adapter
        theAdapter = new TheAdapter(this, locationList);

        // improve performance , if changes in content do not change the layout size
        theRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager theLayoutManager = new LinearLayoutManager(this);
        theRecyclerView.setLayoutManager(theLayoutManager);

        theRecyclerView.setAdapter(theAdapter);

        prepareData();
    }

    private void prepareData() {
        Location Cetatuie = new Location("Cetatuie Park with a View", "Cluj-Napoca", "https://scontent-otp1-1.cdninstagram.com/vp/f87183f1ea58921674feb2c92f3236d8/5CB26B97/t51.2885-15/e35/23507745_855603514618110_623531446383935488_n.jpg");
        Location MirrorStreet = new Location("Mirror Street" , "Cluj-Napoca", "https://scontent-otp1-1.cdninstagram.com/vp/13c639fab45e084ede9a0fba4fb45761/5CB1FD1C/t51.2885-15/e35/28766898_1627136987406515_8412156846122467328_n.jpg");
        Location EroilorStreet = new Location("Eroilor Street", "Bulevardul Eroilor, Cluj-Napoca", "https://scontent-otp1-1.cdninstagram.com/vp/9a138cef0bddfa340e29400a36aa6d90/5CA0469D/t51.2885-15/e35/22277499_750586318460405_7313530359566565376_n.jpg");
        Location CasaDeCultura = new Location("Casa de Cultura a Studentilor", "Cluj-Napoca", "https://scontent-otp1-1.cdninstagram.com/vp/a308843c323890d8086b06cb7efa5629/5C99EE3D/t51.2885-15/e35/22344718_127854451298792_5763195264772866048_n.jpg");
        Location CasutaGalbenaOSUBB = new Location("Casuta Galbena OSUBB" , "Campus Hasdeu, Cluj-Napoca", "https://scontent-otp1-1.cdninstagram.com/vp/32b663e579657936825bbd7e573f658d/5CA37A74/t51.2885-15/e35/22344049_356526391459942_5841533183329304576_n.jpg");
        Location Test = new Location("Test", "Cluj-Napoca", "https://files.primariaclujnapoca.ro/slide/1S0A7921.jpg");

        locationList.add(Cetatuie);
        locationList.add(MirrorStreet);
        locationList.add(EroilorStreet);
        locationList.add(CasaDeCultura);
        locationList.add(CasutaGalbenaOSUBB);
        locationList.add(Test);
    }
}
