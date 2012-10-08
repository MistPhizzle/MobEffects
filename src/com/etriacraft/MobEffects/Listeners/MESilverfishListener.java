package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Silverfish;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MESilverfishListener implements Listener {
	
	@EventHandler
	public void SilverfishBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.SilverfishBlindnessEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.SilverfishBlindnessTime, Config.SilverfishBlindnessPower));
		}
	}
	
	@EventHandler
	public void SilverfishNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishNauseaEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.SilverfishNauseaTime, Config.SilverfishNauseaPower));
		}
	}
	@EventHandler
	public void SilverfishResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishResistanceEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.SilverfishResistanceTime, Config.SilverfishResistancePower));
		}
	}
	@EventHandler
	public void SilverfishFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishFastDiggingEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.SilverfishFastDiggingTime, Config.SilverfishFastDiggingPower));
		}
	}
	
	@EventHandler
	public void SilverfishFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishFireResistanceEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.SilverfishFireResistanceTime, Config.SilverfishFireResistancePower));
		}
	}
	@EventHandler
	public void SilverfishHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishHarmEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.SilverfishHarmTime, Config.SilverfishHarmPower));
		}
	}
	@EventHandler
	public void SilverfishHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishHarmEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.SilverfishHealTime, Config.SilverfishHealPower));
		}
	}
	@EventHandler
	public void SilverfishHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishHungerEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.SilverfishHungerTime, Config.SilverfishHungerPower));
		}
	}
	@EventHandler
	public void SilverfishStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishStrengthEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.SilverfishStrengthTime, Config.SilverfishStrengthPower));
		}
	}
	@EventHandler
	public void SilverfishJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishJumpEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.SilverfishJumpTime, Config.SilverfishJumpPower));
		}
	}
	@EventHandler
	public void SilverfishPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishPoisonEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.SilverfishPoisonTime, Config.SilverfishPoisonPower));
		}
	}
	@EventHandler
	public void SilverfishRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishRegenerationEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.SilverfishRegenerationTime, Config.SilverfishRegenerationPower));
		}
	}
	@EventHandler
	public void SilverfishSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishSlowEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.SilverfishSlowTime, Config.SilverfishSlowPower));
		}
	}
	@EventHandler
	public void SilverfishMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishMiningFatigueEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.SilverfishMiningFatigueTime, Config.SilverfishMiningFatiguePower));
		}
	}
	@EventHandler
	public void SilverfishSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishSpeedEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.SilverfishSpeedTime, Config.SilverfishSpeedPower));
		}
	}
	@EventHandler
	public void SilverfishWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishWaterBreathingEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.SilverfishWaterBreathingTime, Config.SilverfishWaterBreathingPower));
		}
	}
	@EventHandler
	public void SilverfishWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SilverfishWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SilverfishWeaknessEnabled != false && damager instanceof Silverfish && e instanceof Silverfish && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.SilverfishWeaknessTime, Config.SilverfishWeaknessPower));
		}
	}
}