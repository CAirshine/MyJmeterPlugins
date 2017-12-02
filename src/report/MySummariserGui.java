package report;

import java.awt.BorderLayout;

import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.visualizers.gui.AbstractListenerGui;

public class MySummariserGui extends AbstractListenerGui {

	private static final long serialVersionUID = 1L;

	public MySummariserGui() {
		super();
        init();
	}

	private void init() { // WARNING: called from ctor so must not be overridden (i.e. must be private or
							// final)
		setLayout(new BorderLayout());
		setBorder(makeBorder());

		add(makeTitlePanel(), BorderLayout.NORTH);
	}

	@Override
	public TestElement createTestElement() {
		
		MySummariser summariser = new MySummariser();
		modifyTestElement(summariser);
		return summariser;
	}

	@Override
	public String getLabelResource() {
		return "MySummariserGui";
	}
	
	@Override
	public String getStaticLabel() {
		
		return "MySummariser";
	}

	@Override
	public void modifyTestElement(TestElement element) {
		
		super.configureTestElement(element);
	}

}
