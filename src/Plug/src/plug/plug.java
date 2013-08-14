package Plug.src.plug;
import org.bukkit.plugin.java.JavaPlugin;
 
public class plug extends JavaPlugin{
   
    public void onEnable(){
       
        getLogger().info("onEnable has been invoked!");       
    }
   
    public void onDisable(){
       
    	getLogger().info("onDisable has been invoked!");       
    }
 
}