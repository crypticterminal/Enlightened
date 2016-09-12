package xyz.iridiumion.enlightened.editor;

import java.util.regex.Pattern;

/**
 * Author: 0xFireball
 */
public interface HighlightingDefinition {
    Pattern getLinePattern();

    Pattern getNumberPattern();

    Pattern getPreprocessorPattern();

    Pattern getKeywordPattern();

    Pattern getBuiltinsPattern();

    Pattern getCommentsPattern();
}
