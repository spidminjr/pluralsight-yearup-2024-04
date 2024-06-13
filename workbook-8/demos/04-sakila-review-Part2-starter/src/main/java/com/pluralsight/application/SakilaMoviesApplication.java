package com.pluralsight.application;

import com.pluralsight.controllers.ActorsController;
import com.pluralsight.models.Actor;
import com.pluralsight.views.actors.ActorAddView;
import com.pluralsight.views.actors.ActorListView;
import com.pluralsight.views.HomeView;

import java.util.List;

public class SakilaMoviesApplication
{
    // controllers
    private ActorsController actorsController;

    // views
    private HomeView homeView;
    private ActorListView actorListView;
    private ActorAddView actorAddView;

    public SakilaMoviesApplication(
            ActorsController actorsController
            , HomeView homeView
            , ActorListView actorListView
            , ActorAddView actorAddView)
    {
        this.actorsController = actorsController;
        this.homeView = homeView;
        this.actorListView = actorListView;
        this.actorAddView = actorAddView;
    }

    public void run()
    {
        while(true)
        {
            int selection = homeView.getUserSelection();

            switch (selection)
            {
                case 1 -> actorsMenu();
                case 2 -> addActor();
                case 0 -> System.exit(0);
            }
        }
    }

    private void actorsMenu()
    {
        while(true)
        {
            int selection = homeView.getUserSelection();

            switch (selection)
            {
                case 1 -> displayActorList();
                case 2 -> searchActors();
                case 3 -> addActor();
                case 0 -> { return; }
            }
        }
    }

    private void displayActorList()
    {
        // go to the Actors controller and get a list of actors
        List<Actor> actors = actorsController.findAllActors();

        // call the ActorListView and pass in the returned list
        actorListView.displayActors(actors);
    }

    private void searchActors()
    {
    }

    private void addActor()
    {
        Actor newActor = actorAddView.getNewActor();

        actorsController.addNewActor(newActor);
    }



    private void filmsMenu()
    {
        while(true)
        {
            int selection = homeView.getUserSelection();

            switch (selection)
            {
                case 1 -> displayActorList();
                case 2 -> searchActors();
                case 3 -> addActor();
                case 0 -> { return; }
            }
        }
    }
}
