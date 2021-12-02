package ru.aquapark.entertainment.config;

import ru.aquapark.entertainment.model.Slides;
import ru.aquapark.entertainment.model.SlidesList;

import java.util.ArrayList;
import java.util.Scanner;

public class StartConfig {

    public static void  start(){
        SlidesList slidesList = createSlides();
        Slides slides = creatSlide();
        Slides resultSlide = slidesList.get(slides);
        print(resultSlide);


    }

    private static SlidesList createSlides() {

        SlidesList slidesList = new SlidesList(new ArrayList<>());
        Slides slides = new Slides("yellow", 180, 3, true, 15.0);
        Slides slides1 = new Slides("green", 280, 5, true, 25.0);
        Slides slides2 = new Slides("blue", 200, 6, false, 20.0);

        slidesList.add(slides);
        slidesList.add(slides1);
        slidesList.add(slides2);
        return slidesList;

    }

    private static Slides creatSlide(){
        return  Slides.builder()
                .colour(new Scanner(System.in).nextLine())
                .height(new Scanner(System.in).nextInt())
                .width(new Scanner(System.in).nextInt())
                .build();
    }
    private static void print(Slides slides) {
        System.out.println(slides);
    }

}

