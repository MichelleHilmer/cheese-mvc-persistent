package org.launchcode.models;

public class AddMenuItemForm {
    private Menu menu;
    private Iterable<Cheese> cheeses;

    private int MenuId;
    private int CheeseId;

    public AddMenuItemForm(){

    }

    public AddMenuItemForm(Menu menu, Iterable<Cheese> all) {
    }

    public Menu getMenu() {
        return menu;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public int getMenuId() {
        return MenuId;
    }

    public int getCheeseId() {
        return CheeseId;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }
}
