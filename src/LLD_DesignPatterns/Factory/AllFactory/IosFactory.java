package LLD_DesignPatterns.Factory.AllFactory;

import LLD_DesignPatterns.Factory.Components.Button.Button;
import LLD_DesignPatterns.Factory.Components.Button.IosButton;
import LLD_DesignPatterns.Factory.Components.Dropdown.Dropdown;
import LLD_DesignPatterns.Factory.Components.Dropdown.IosDropdown;
import LLD_DesignPatterns.Factory.Components.Menu.IosMenu;
import LLD_DesignPatterns.Factory.Components.Menu.Menu;

public class IosFactory implements UIFactory{

    @Override
    public Menu createMenu(){
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown(){
        return new IosDropdown();
    }

    @Override
    public Button createButton(){
        return new IosButton();
    }
}
