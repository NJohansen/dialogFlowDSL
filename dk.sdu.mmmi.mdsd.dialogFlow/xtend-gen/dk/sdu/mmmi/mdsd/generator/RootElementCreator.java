package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem;
import java.util.UUID;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class RootElementCreator {
  private String systemName;
  
  public RootElementCreator(final String systemName) {
    this.systemName = systemName;
  }
  
  public void generateElements(final DialogFlowSystem sys, final IFileSystemAccess2 fsa) {
    fsa.generateFile(
      (this.systemName + "/package.json"), 
      this.createPackageFile());
    fsa.generateFile(
      (this.systemName + "/agent.json"), 
      this.createAgenFile());
  }
  
  public CharSequence createPackageFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"version\": \"1.0.0\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createAgenFile() {
    CharSequence _xblockexpression = null;
    {
      final UUID secondaryKey = UUID.randomUUID();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"description\": \"\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"language\": \"en\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"shortDescription\": \"\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"examples\": \"\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"linkToDocs\": \"\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"displayName\": \"");
      _builder.append(this.systemName, "  ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("\"disableInteractionLogs\": false,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"disableStackdriverLogs\": true,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"defaultTimezone\": \"Europe/Kaliningrad\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"isPrivate\": true,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"mlMinConfidence\": 0.3,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"supportedLanguages\": [],");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"enableOnePlatformApi\": true,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"onePlatformApiVersion\": \"v2\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"secondaryKey\": \"");
      String _string = secondaryKey.toString();
      _builder.append(_string, "  ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("\"analyzeQueryTextSentiment\": false,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"enabledKnowledgeBaseNames\": [],");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"knowledgeServiceConfidenceAdjustment\": 0.0,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"dialogBuilderMode\": false,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"baseActionPackagesUrl\": \"\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"enableSpellCorrection\": false");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
