package BlockBreakExtar;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author ku
 */
public class BlockBreakExtar 
extends JavaPlugin implements Listener
{
    
    public static FileConfiguration conf;
    public static File cfile;
    
    public void onEnable(){
        
        conf = getConfig();
        conf.options().copyDefaults(true);
        saveDefaultConfig();
        cfile = new File(getDataFolder(), "config.yml");
        
        Bukkit.getLogger().info(getDescription() + " be has enable version: " + getDescription().getVersion());
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents((Listener) new Commands(),this);
        regCmd();
        manager.registerEvents((Listener) new Events(),this);
    }
    public void onDisable(){
        Bukkit.getServer().getPluginManager().disablePlugins();
    }
    
    public void regCmd(){
        getCommand("bbe").setExecutor(new Commands());
        getCommand("bbereload").setExecutor(new Commands());
    }
    
    public class Events implements Listener{
        @EventHandler
        public void BlockExp(BlockExpEvent e){
            
           Block b = e.getBlock();
           Location l = e.getBlock().getLocation();
           
           //Block drop exp
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-1")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-1"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-2")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-2"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-3")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-3"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-4")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-4"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-5")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-5"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-6")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-6"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-7")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-7"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-8")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-8"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-9")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-9"));
           }
           if(new Location(l.getWorld(), l.getX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("block-drop-exp-id-10")){
               e.setExpToDrop(conf.getInt("block-set-exp-drop-10"));
           }
           
           
        }
        
        public void EventBlockBreak(BlockBreakEvent e){
            Player p = e.getPlayer();
            Block b = e.getBlock();
            Location l = e.getBlock().getLocation();
             
            //No Break Block
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-1")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-2")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-3")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-4")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-5")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-6")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-7")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-8")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-9")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("no-break-10")){
                 e.setCancelled(true);
                 (p).sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
             }
             
            //Bast Block Player get commands
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-1")){
                (p).performCommand(conf.getString("bast-block-command-1"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-2")){
                (p).performCommand(conf.getString("bast-block-command-2"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-3")){
                (p).performCommand(conf.getString("bast-block-command-3"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-4")){
                (p).performCommand(conf.getString("bast-block-command-4"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-5")){
                (p).performCommand(conf.getString("bast-block-command-5"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-6")){
                (p).performCommand(conf.getString("bast-block-command-6"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-7")){
                (p).performCommand(conf.getString("bast-block-command-7"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-8")){
                (p).performCommand(conf.getString("bast-block-command-8"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-9")){
                (p).performCommand(conf.getString("bast-block-command-9"));
            }
            if(new Location(l.getWorld(), l.getBlockX(), l.getBlockY(), l.getBlockZ()).getBlock().getTypeId() == conf.getInt("bast-block-type-command-10")){
                (p).performCommand(conf.getString("bast-block-command-10"));
            }
            
        }
    
    }
    
    public class Commands implements CommandExecutor,Listener{

        @Override
        public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {
            if(Sender instanceof Player){
                if(Sender.isOp()){
                    if(args.length == 0){
            if(cmd.getName().equalsIgnoreCase("bbe")){
                Sender.sendMessage(ChatColor.DARK_BLUE + "[BlockBreakExtar]: " + ChatColor.RESET + "contact me -> www.facebook.com/moyfull.jancak"
                + "\n" + ChatColor.GREEN + "Reload Configuration -> " + ChatColor.DARK_GREEN + "\"/bbereload\""
                );
            }
            if(cmd.getName().equalsIgnoreCase("bbereload")){
                conf = YamlConfiguration.loadConfiguration(cfile);
                Sender.sendMessage(ChatColor.GREEN + "Reload succss");
            }
                    }
                    if(args.length > 0){
                        Sender.sendMessage(ChatColor.DARK_BLUE + "[BlockBreakExtar]: " + ChatColor.DARK_RED + "don't has commands.");
                    }
                }else{
                    Sender.sendMessage(ChatColor.DARK_RED + "You don't has admin.");
                }
            }else{
                Sender.sendMessage(ChatColor.DARK_PURPLE + "Console can not use.");
            }
            return true;
        }
    }
    
    }
        
