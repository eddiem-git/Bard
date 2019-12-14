public class Song extends Spell{
    CastTime timeCasted;
    Spell spell;

    public Song(CastTime timeCasted, Spell spell) {
        this.timeCasted = timeCasted;
        this.spell = spell;
    }
    public Song(){

    }
}
