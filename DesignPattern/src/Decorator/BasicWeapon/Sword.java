package Decorator.BasicWeapon;

//劍
public class Sword extends Weapon {

	public Sword() {
		super.Name = "劍";
	}

	public double AttackPower() {
		return 10.0;
	}
}