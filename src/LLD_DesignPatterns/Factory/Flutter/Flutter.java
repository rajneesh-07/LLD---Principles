package LLD_DesignPatterns.Factory.Flutter;

import LLD_DesignPatterns.Factory.AllFactory.AndroidFactory;
import LLD_DesignPatterns.Factory.AllFactory.IosFactory;
import LLD_DesignPatterns.Factory.AllFactory.UIFactory;
import LLD_DesignPatterns.Factory.AllFactory.WindowsFactory;

public class Flutter {
    private SupportPlatforms supportPlatforms;

    public Flutter(SupportPlatforms supportPlatforms){
        this.supportPlatforms = supportPlatforms;
    }

    public void setTheme(){}
    public void setSounds(){}

    public UIFactory uiFactory(){
        if(supportPlatforms.equals(SupportPlatforms.WINDOWS)){
            return new WindowsFactory();
        }
        else if(supportPlatforms.equals(SupportPlatforms.ANDROID)){
            return new AndroidFactory();
        }
        else{
            return new IosFactory();
        }
    }
}
