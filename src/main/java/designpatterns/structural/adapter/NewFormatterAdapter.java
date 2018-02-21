package designpatterns.structural.adapter;

public class NewFormatterAdapter implements NewFormatter {

	private LegacyFormatter legacyFormatter;

	public NewFormatterAdapter(LegacyFormatter legacyFormatter) {
		this.legacyFormatter = legacyFormatter;
	}

	@Override
	public void formatRichText(String text) {
		legacyFormatter.formatText(text);
	}

}