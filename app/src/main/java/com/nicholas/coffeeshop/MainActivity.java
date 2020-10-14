package com.nicholas.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItems = findViewById(R.id.rvCoffeeList);
        DrinksAdapter adapter = new DrinksAdapter(this, drinks());
        RecyclerView.LayoutManager layoutManager
                = new StaggeredGridLayoutManager
                (2, StaggeredGridLayoutManager.VERTICAL);
        rvItems.setAdapter(adapter);
        rvItems.setLayoutManager(layoutManager);
        rvItems.addItemDecoration(new SpacesItemDecoration(10));
    }

    private ArrayList<Drink> drinks() {
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Caramel Frappuccino",
                "Buttery caramel syrup meets coffee, " +
                        "milk and ice for a rendezvous in the blender. " +
                        "Then whipped cream and caramel sauce layer the love on top.",
                R.drawable.caramel_frap, 5.75));
        drinks.add(new Drink("Caramel Cream Frappuccino",
                "Milk blended with caramel sauce and ice " +
                        "then topped with whipped cream and caramel drizzle.",
                R.drawable.caramel_cream_frap, 5.75));
        drinks.add(new Drink("Double Chocolate Cream",
                "Rich mocha-flavored sauce meets up with chocolaty chips, " +
                        "milk and ice for a blender bash. Top it off with sweetened " +
                        "whipped cream and mocha drizzle for a real party in your mouth.",
                R.drawable.double_choco_cream_frap, 5.75));
        drinks.add(new Drink("Green Tea Cream",
                "We blend sweetened premium matcha green tea, " +
                        "milk and ice and top it with sweetened whipped cream " +
                        "to give you a delicious boost of energy.",
                R.drawable.green_tea_cream_frap, 6.50));
        drinks.add(new Drink("Java Chip Frappuccino",
                "We blend mocha sauce and Frappuccino® chips with coffee, milk " +
                        "and ice, then top with whipped cream and mocha drizzle " +
                        "to bring you endless java joy.",
                R.drawable.java_chip_frap, 5.75));
        drinks.add(new Drink("Dark Mocha Frappuccino",
                "For serious chocolate lovers: We blend dark cocoa with milk, " +
                        "ice and coffee for an extraordinarily chocolatey experience " +
                        "that's then topped with a swirl of whipped cream.",
                R.drawable.dark_mocha_frap, 5.75));
        return drinks;
    }
}