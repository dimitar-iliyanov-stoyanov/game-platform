package tests.designpatterns.structural.adapter;

import org.junit.Test;

import designpatterns.structural.adapter.LegacyFormatter;
import designpatterns.structural.adapter.LegacyFormatterImpl;
import designpatterns.structural.adapter.NewFormatter;
import designpatterns.structural.adapter.NewFormatterAdapter;
import designpatterns.structural.adapter.NewFormatterImpl;

public class Client {

	@Test
	public void testAdapter() {
		LegacyFormatter legacyFormatter = new LegacyFormatterImpl();
		legacyFormatter.formatText("Test text");

		NewFormatter newFormatter = new NewFormatterImpl();
		newFormatter.formatRichText("Test text");

		NewFormatter newFormatterAdapter = new NewFormatterAdapter(legacyFormatter);
		newFormatterAdapter.formatRichText("Test text");
	}

}