package org.launchcode.models;

public class AddMenuItemForm {
    private Menu menu;
    private Iterable<Cheese> cheeses;

    private int menuId;
    private int cheeseId;

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
        return menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }
}
