package Decorator.Strengthen;
import Decorator.BasicWeapon.Weapon;

//劇毒
public class Toxic extends StrengthenDecorator
{
  private Weapon _weapon;

  public Toxic(Weapon weapon)
  {
      _weapon = weapon;
  }

  public double AttackPower()
  {
      return _weapon.AttackPower() + 100;
  }

  public String GetName()
  {
      return "劇毒的" + _weapon.GetName();
  }
}