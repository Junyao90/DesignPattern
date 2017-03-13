package kenny.designpattern.builder_pattern.builder;

import kenny.designpattern.builder_pattern.product.Computer;
import kenny.designpattern.builder_pattern.product.Macbook;

/**
 * @author Junyao
 */

public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();

    @Override
    public Builder buildBoard(String board) {
        mComputer.setBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        mComputer.setOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
