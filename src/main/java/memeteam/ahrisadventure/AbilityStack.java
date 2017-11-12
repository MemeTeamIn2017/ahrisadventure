package memeteam.ahrisadventure;

public class AbilityStack {
	private Ability ability;
	private int timeLeft;
	
	public AbilityStack(Ability ability) {
		this.ability = ability;
		timeLeft = Constants.getAbilityTime(ability);
	}
	
	public void use(Player player) {
		ability.use(player);
	}
	
	public Ability getAbility() {
		return ability;
	}
	
	
	public int getTimeLeft() {
		return timeLeft;
	}
}
