package adapter.wrapperNode;

import adapter.node.Node;

public class WrapperNode extends Node implements IWrapperNode {

    @Override
    public void doSomethingOther() {
        doSomething();
    }
}
