package kenny.designmode.builder_mode.builder;

import kenny.designmode.builder_mode.product.Computer;
import kenny.designmode.builder_mode.product.Macbook;

/**
 * @author Junyao
 * @package kenny.designmode.builder_mode
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
