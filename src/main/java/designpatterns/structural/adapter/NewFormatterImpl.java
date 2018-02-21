package designpatterns.structural.adapter;

public class NewFormatterImpl implements NewFormatter {

	@Override
	public void formatRichText(String text) {
		System.out.println("Rich text formatting: " + text);
	}

}