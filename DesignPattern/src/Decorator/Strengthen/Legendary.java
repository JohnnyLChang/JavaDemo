package Decorator.Strengthen;

import Decorator.BasicWeapon.Weapon;

//傳說
public class Legendary extends StrengthenDecorator
{
  private Weapon _weapon;

  public Legendary(Weapon weapon)
  {
      _weapon = weapon;
  }

  public double AttackPower()
  {
      return _weapon.AttackPower() + 9999;
  }

  public String GetName()
  {
      return "傳說的" + _weapon.GetName();
  }
}