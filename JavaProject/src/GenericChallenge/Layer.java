package GenericChallenge;

import java.util.ArrayList;
import java.util.List;

public class Layer<C extends Mappable> {

	private List<C> layerElements;

	public Layer(C[] layerElements) {
		this.layerElements = new ArrayList<C>(List.of(layerElements));
	}

	public void addElements(C... elements) {
		layerElements.addAll(List.of(elements));
	}

	public void renderLayer() {

		for (C element : layerElements) {
			element.render();
		}
	}
}