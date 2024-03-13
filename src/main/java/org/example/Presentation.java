import java.util.ArrayList;


/**
 * <p>Presentation houdt de slides in de presentatie bij.</p>
 * <p>Er is slechts één instantie van deze klasse aanwezig.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class Presentation {
	private String showTitle; // de titel van de presentatie
	private ArrayList<Slide> showList = null; // een ArrayList met de Slides
	private int currentSlideNumber = 0; // het slidenummer van de huidige Slide
	private SlideViewerComponent slideViewComponent = null; // de viewcomponent voor de Slides

	public Presentation() {
		slideViewComponent = null;
		clear();
	}

	public Presentation(SlideViewerComponent slideViewerComponent) {
		this.slideViewComponent = slideViewerComponent;
		clear();
	}

	public int getSize() {
		return showList.size();
	}

	public String getTitle() {
		return showTitle;
	}

	public void setTitle(String nt) {
		showTitle = nt;
	}

	public void setShowView(SlideViewerComponent slideViewerComponent) {
		this.slideViewComponent = slideViewerComponent;
	}

	// geef het nummer van de huidige slide
	public int getSlideNumber() {
		return currentSlideNumber;
	}

	// verander het huidige-slide-nummer en laat het aan het window weten.
	public void setSlideNumber(int number) {
		currentSlideNumber = number;
		if (slideViewComponent != null) {
			slideViewComponent.update(this, getCurrentSlide());
		}
	}

	// ga naar de vorige slide tenzij je aan het begin van de presentatie bent
	public void prevSlide() {
		if (currentSlideNumber > 0) {
			setSlideNumber(currentSlideNumber - 1);
	    }
	}

	// Ga naar de volgende slide tenzij je aan het einde van de presentatie bent.
	public void nextSlide() {
		if (currentSlideNumber < (showList.size()-1)) {
			setSlideNumber(currentSlideNumber + 1);
		}
	}

	// Verwijder de presentatie, om klaar te zijn voor de volgende
	void clear() {
		showList = new ArrayList<Slide>();
		setSlideNumber(-1);
	}

	// Voeg een slide toe aan de presentatie
	public void append(Slide slide) {
		showList.add(slide);
	}

	// Geef een slide met een bepaald slidenummer
	public Slide getSlide(int number) {
		if (number < 0 || number >= getSize()){
			return null;
	    }
			return (Slide)showList.get(number);
	}

	// Geef de huidige Slide
	public Slide getCurrentSlide() {
		return getSlide(currentSlideNumber);
	}

	public void exit(int n) {
		System.exit(n);
	}
}
