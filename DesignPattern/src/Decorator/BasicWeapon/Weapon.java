package Decorator.BasicWeapon;

//武器 抽象類
public abstract class Weapon {
	public String Name = "砂鍋大的鐵拳";

	public String GetName() {
		return Name;
	}

	public abstract double AttackPower();
}

