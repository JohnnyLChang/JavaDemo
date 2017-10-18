package Decorator.Strengthen;

import Decorator.BasicWeapon.Weapon;

//鋒利
public class Sharp extends StrengthenDecorator
{
  private Weapon _weapon;

  public Sharp(Weapon weapon)
  {
      _weapon = weapon;
  }

  public double AttackPower()
  {
      return _weapon.AttackPower() + 20;
  }

  public String GetName()
  {
      return "鋒利的" + _weapon.GetName();
  }
}