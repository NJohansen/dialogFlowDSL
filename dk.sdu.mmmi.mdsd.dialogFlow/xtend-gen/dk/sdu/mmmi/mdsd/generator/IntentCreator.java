package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.dialogFlow.ActionValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Actions;
import dk.sdu.mmmi.mdsd.dialogFlow.Entity;
import dk.sdu.mmmi.mdsd.dialogFlow.Intent;
import dk.sdu.mmmi.mdsd.dialogFlow.Mapping;
import dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue;
import dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class IntentCreator {
  private String systemName;
  
  public IntentCreator(final String systemName) {
    this.systemName = systemName;
  }
  
  public void generateIntent(final Intent intent, final IFileSystemAccess2 fsa) {
    this.generateUsersays(intent, fsa);
    this.generateResponse(intent, fsa);
  }
  
  private void generateUsersays(final Intent intent, final IFileSystemAccess2 fsa) {
    String _name = intent.getName();
    String _plus = ((this.systemName + "/intents/") + _name);
    String _plus_1 = (_plus + "_usersays_en.json");
    fsa.generateFile(_plus_1, 
      this.compileUserSays(intent));
  }
  
  private void generateResponse(final Intent intent, final IFileSystemAccess2 fsa) {
    String _name = intent.getName();
    String _plus = ((this.systemName + "/intents/") + _name);
    String _plus_1 = (_plus + ".json");
    fsa.generateFile(_plus_1, 
      this.compilePhrases(intent));
  }
  
  private CharSequence compileUserSays(final Intent intent) {
    CharSequence _xblockexpression = null;
    {
      String id = UUID.randomUUID().toString();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"id\": \"");
      _builder.append(id, "    ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("\"data\": [");
      _builder.newLine();
      {
        EList<PhraseValue> _phrases = intent.getPhrase().getPhrases();
        boolean _hasElements = false;
        for(final PhraseValue expression : _phrases) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",", "    ");
          }
          {
            EList<Mapping> _mapping = expression.getMapping();
            for(final Mapping value : _mapping) {
              _builder.append("\t\t    \t\t");
              _builder.append("{");
              _builder.newLine();
              _builder.append("\"text\": \"");
              String _value = value.getValue();
              _builder.append(_value);
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              {
                Entity _entity = value.getEntity();
                boolean _tripleNotEquals = (_entity != null);
                if (_tripleNotEquals) {
                  _builder.append("\"meta\": \"@");
                  String _name = value.getEntity().getName();
                  _builder.append(_name);
                  _builder.append("\",");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\"alias\": \"@");
                  String _name_1 = value.getEntity().getName();
                  _builder.append(_name_1);
                  _builder.append("\",\t\t\t\t\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\"userDefined\": false");
              _builder.newLine();
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("    ");
      _builder.append("],");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"isTemplate\": false,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"count\": 0,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"lang\": \"en\",");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"updated\": 0");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("]");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence compilePhrases(final Intent intent) {
    CharSequence _xblockexpression = null;
    {
      String id = UUID.randomUUID().toString();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"id\": \"");
      _builder.append(id, "  ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("\"name\": \"");
      String _name = intent.getName();
      _builder.append(_name, "  ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("\"auto\": true,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"contexts\": [],");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"responses\": [");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("{");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("\"resetContexts\": true,");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("\"action\": \"hotel.book\",");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("\"affectedContexts\": [],");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("\"parameters\": [");
      _builder.newLine();
      {
        Actions _action = intent.getAction();
        boolean _tripleNotEquals = (_action != null);
        if (_tripleNotEquals) {
          {
            EList<ActionValue> _actions = intent.getAction().getActions();
            boolean _hasElements = false;
            for(final ActionValue parameter : _actions) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(",", "      ");
              }
              _builder.append("      ");
              _builder.append("{");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"id\": \"");
              String _string = UUID.randomUUID().toString();
              _builder.append(_string, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"name\": \"");
              String _name_1 = parameter.getName();
              _builder.append(_name_1, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"required\": false,");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"dataType\": \"@");
              String _name_2 = parameter.getType().getName();
              _builder.append(_name_2, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"value\": \"$");
              String _value = parameter.getValue();
              _builder.append(_value, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"defaultValue\": \"\",");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"isList\": ");
              {
                String _list = parameter.getList();
                boolean _tripleNotEquals_1 = (_list != null);
                if (_tripleNotEquals_1) {
                  _builder.append("\"true\"");
                } else {
                  _builder.append("\"false\"");
                }
              }
              _builder.append(",");
              _builder.newLineIfNotEmpty();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"prompts\": [],");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"promptMessages\": [],");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"noMatchPromptMessages\": [],");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"noInputPromptMessages\": [],");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("  ");
              _builder.append("\"outputDialogContexts\": []");
              _builder.newLine();
              _builder.append("      ");
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("      ");
      _builder.append("],");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("\"messages\": [");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("{");
      _builder.newLine();
      _builder.append("          ");
      _builder.append("\"type\": \"0\",");
      _builder.newLine();
      _builder.append("          ");
      _builder.append("\"title\": \"\",");
      _builder.newLine();
      _builder.append("          ");
      _builder.append("\"textToSpeech\": \"\",");
      _builder.newLine();
      _builder.append("          ");
      _builder.append("\"lang\": \"en\",");
      _builder.newLine();
      _builder.append("          ");
      _builder.append("\"speech\": [");
      _builder.newLine();
      {
        EList<ResponseValue> _responses = intent.getResponse().getResponses();
        boolean _hasElements_1 = false;
        for(final ResponseValue reply : _responses) {
          if (!_hasElements_1) {
            _hasElements_1 = true;
          } else {
            _builder.appendImmediate(",", "          ");
          }
          _builder.append("          ");
          _builder.append("\"");
          String _response = reply.getResponse();
          _builder.append(_response, "          ");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("          ");
      _builder.append("],");
      _builder.newLine();
      _builder.append("          ");
      _builder.append("\"condition\": \"\"");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("},");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("],");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("\"speech\": []");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("],");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"priority\": 500000,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"webhookUsed\": true,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"webhookForSlotFilling\": false,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"fallbackIntent\": false,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"events\": [],");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"conditionalResponses\": [],");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"condition\": \"\",");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"conditionalFollowupEvents\": []");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
