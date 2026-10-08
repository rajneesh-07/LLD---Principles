package LLD_DesignPatterns.Factory.AllFactory;

import LLD_DesignPatterns.Factory.Components.Button.AndroidButton;
import LLD_DesignPatterns.Factory.Components.Button.Button;
import LLD_DesignPatterns.Factory.Components.Dropdown.AndroidDropdown;
import LLD_DesignPatterns.Factory.Components.Dropdown.Dropdown;
import LLD_DesignPatterns.Factory.Components.Menu.AndriodMenu;
import LLD_DesignPatterns.Factory.Components.Menu.Menu;

public class AndroidFactory implements UIFactory{

    @Override
    public Menu createMenu(){
        return new AndriodMenu();
    }

    @Override
    public Dropdown createDropdown(){
        return new AndroidDropdown();
    }

    @Override
    public Button createButton(){
        return new AndroidButton();
    }
}
