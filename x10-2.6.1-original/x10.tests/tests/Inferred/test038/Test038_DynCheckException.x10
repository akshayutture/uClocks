//OPTIONS: -STATIC_CHECKS=false -CONSTRAINT_INFERENCE=false -VERBOSE_INFERENCE=true



import harness.x10Test;

public class Test038_DynCheckException extends x10Test {

    public def mustFailRun(): boolean {
	Test038_DynChecks.f(new Elt(1));
        return true;
    }

    public def run() {
        try { mustFailRun(); return false; } catch (FailedDynamicCheckException) {}
        return true;
    }

    public static def main(Rail[String]) {
    	new Test038_DynCheckException().execute();
    }

}
