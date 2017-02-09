/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlockBreakExtar;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;
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
    
    public static Configuration conf;
    
    public void onEnable(){
        conf = getConfig();
        saveDefaultConfig();
        Bukkit.getLogger().info(getDescription() + " be has enable version: " + getDescription().getVersion());
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents((Listener) new Events(),this);
        manager.registerEvents((Listener) new Commands(),this);
        regCmd();
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
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-1"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-1"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-2"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-2"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-3"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-3"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-4"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-4"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-5"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-5"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-6"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-6"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-7"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-7"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-8"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-8"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-9"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-9"));
           }
           if(b.getType() == Material.getMaterial(conf.getString("block-type-drop-exp-10"))){
               e.setExpToDrop(conf.getInt("blcok-set-exp-drop-10"));
           }
        }
        public void EventBlockBreak(BlockBreakEvent e){
            Player p = e.getPlayer();
            Block b = e.getBlock();
             
             if(b.getType() == Material.getMaterial(conf.getString("no-break-1"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-2"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-3"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-4"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-5"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-6"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-7"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-8"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-9"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            if(b.getType() == Material.getMaterial(conf.getString("no-break-10"))){
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_RED + "You can not beat Brock this.");
            }
            
            //block break commands
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-1"))){
                (p).performCommand(conf.getString("block-break-commands-1"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-2"))){
                (p).performCommand(conf.getString("block-break-commands-2"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-3"))){
                (p).performCommand(conf.getString("block-break-commands-3"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-4"))){
                (p).performCommand(conf.getString("block-break-commands-4"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-5"))){
                (p).performCommand(conf.getString("block-break-commands-5"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-6"))){
                (p).performCommand(conf.getString("block-break-commands-6"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-7"))){
                (p).performCommand(conf.getString("block-break-commands-7"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-8"))){
                (p).performCommand(conf.getString("block-break-commands-8"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-9"))){
                (p).performCommand(conf.getString("block-break-commands-9"));
            }
            if(b.getType() == Material.getMaterial(conf.getString("block-break-type-cmd-10"))){
                (p).performCommand(conf.getString("block-break-commands-10"));
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
                try {
                    saveConfig();
                } catch (Exception e) {
                }
                Sender.sendMessage(ChatColor.DARK_GREEN + "Reload succss");
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
