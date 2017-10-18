package Decorator.Strengthen;

import Decorator.BasicWeapon.Weapon;

//加長
public class Long extends StrengthenDecorator
{
  private Weapon _weapon;
  public Long(Weapon weapon)
  {
      _weapon = weapon;
  }

  public double AttackPower()
  {
      return _weapon.AttackPower() + 5;
  }

  public String GetName()
  {
      return "加長的" + _weapon.GetName();
  }
}