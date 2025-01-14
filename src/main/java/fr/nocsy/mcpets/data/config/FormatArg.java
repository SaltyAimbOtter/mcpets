package fr.nocsy.mcpets.data.config;

public class FormatArg
{
    private String toReplace;
    private String replaceWith;

    public FormatArg(String toReplace, String replaceWith)
    {
        this.toReplace = toReplace;
        this.replaceWith = replaceWith;
    }

    /**
     * Apply the format to the specified string
     * @param toApply
     * @return
     */
    public String applyToString(String toApply)
    {
        return toApply.replace(toReplace, replaceWith);
    }
}
