package me.av306.dingzauth.Main;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public class Main extends JavaPlugin
{
	public static Server server;
	public static PluginManager pluginManager;
	public static Logger logger = Bukkit.getLogger();

	public static final ChatColor INFO = ChatColor.AQUA;
  public static final ChatColor SUCCESS = ChatColor.GREEN;
  public static final ChatColor WARN = ChatColor.YELLOW;
  public static final ChatColor ERROR = ChatColor.RED;

	package-private static final String ID = "DingzAuth";


	@Override
	public void onEnable()
	{
		// Initialise server and plugin manager
    server = this.getServer();
    pluginManager = server.getPluginManager();

		// debug, TODO: remove for release
		LOGGER.info( "MCValorant plugin created by AV3_08!" );
    logConsole( "Initialising! Here we go!" );
    logConsole( "Server: " + server.getName() );
    logConsole( "Plugins: " + Arrays.toString( pluginManager.getPlugins() ) );
	}


	public static void logConsole( String msg )
    {
        LOGGER.info(
					String.format( "[%s] %s", ID, msg )
				);
    }
}
