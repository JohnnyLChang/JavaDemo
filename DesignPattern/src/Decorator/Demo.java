package Decorator;

import Decorator.BasicWeapon.*;
import Decorator.Strengthen.*;
import Decorator.Strengthen.Long;

public class Demo {

	public static void show(Weapon weapon) {
		System.out.println(weapon.GetName()+ weapon.AttackPower());
	}
	public static void main(String[] args) {
		Weapon weapon = new Knife();
		show(weapon);
		weapon = new Long(weapon);
		show(weapon);
		weapon = new Sharp(weapon);
		show(weapon);
		weapon = new Toxic(weapon);
		show(weapon);
		weapon = new Legendary(weapon);
		show(weapon);
		weapon = new Legendary(weapon);
		show(weapon);
	}

}
