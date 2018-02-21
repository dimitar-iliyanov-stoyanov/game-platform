package designpatterns.structural.adapter;

public class LegacyFormatterImpl implements LegacyFormatter {

	@Override
	public void formatText(String text) {
		System.out.println(text);
	}

}