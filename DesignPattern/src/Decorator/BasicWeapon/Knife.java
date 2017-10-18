package Decorator.BasicWeapon;

//刀
public class Knife extends Weapon {

	public Knife() {
		super.Name = "刀";
	}

	public double AttackPower() {
		return 5;
	}
}