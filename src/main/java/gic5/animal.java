package gic5;

public abstract class animal {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String type;
    private String name;
    private float Run;
    private float Swim;
    private float Jump;

   animal (String type, String name, float Jump, float Run, float Swim) {
       this.type = type;
       this.name = name;
       this.Jump = Jump;
       this.Run = Run;
       this.Swim = Swim;
   }
    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    float getRun() {
        return this.Run;
    }

    float getSwim() {
        return this.Swim;
    }

    float getJump() {
        return this.Jump;
    }
    protected boolean run(float distance) {
        return (distance <= Run);
    }

    protected int swim(float distance) {
        return (distance <= Swim) ? SWIM_OK : SWIM_FAIL;
    }

    protected boolean jump(float height) {
        return (height <= Jump);
    }
}
