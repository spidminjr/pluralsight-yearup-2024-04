package com.pluralsight.application;

import com.pluralsight.models.Actor;

import java.util.List;

public class SakilaMoviesApplication
{
    private final ApplicationConfiguration config;

    public SakilaMoviesApplication(ApplicationConfiguration config)
    {
        this.config = config;
    }


    public void run()
    {
        while(true)
        {
            int selection = displayHomeSelection();

            switch (selection)
            {
                case 1 -> displayActorList();
                case 0 -> System.exit(0);
            }
        }
    }

    private int displayHomeSelection()
    {
        return config.homeView.getUserSelection();
    }

    private void displayActorList()
    {
        // go to the Actors controller and get a list of actors
        List<Actor> actors = config.actorsController.findAllActors();

        // call the ActorListView and pass in the returned list
        config.actorRowView.displayActors(actors);
    }

}
