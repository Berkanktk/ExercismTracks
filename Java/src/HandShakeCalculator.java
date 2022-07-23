import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {
    List<Signal> calculateHandshake(int i) {
        List<Signal> signals = new ArrayList<Signal>();
        if ((i & 1) == 1)
            signals.add(Signal.WINK);
        if ((i & 2) == 2)
            signals.add(Signal.DOUBLE_BLINK);
        if ((i & 4) == 4)
            signals.add(Signal.CLOSE_YOUR_EYES);
        if ((i & 8) == 8)
            signals.add(Signal.JUMP);
        if ((i & 16) == 16)
            Collections.reverse(signals);
        return signals;
    }
}

// MADE IN ORDER TO REMOVE ERRORS
class Signal {
    public static Signal DOUBLE_BLINK;
    public static Signal CLOSE_YOUR_EYES;
    public static Signal WINK;
    public static Signal JUMP;
}