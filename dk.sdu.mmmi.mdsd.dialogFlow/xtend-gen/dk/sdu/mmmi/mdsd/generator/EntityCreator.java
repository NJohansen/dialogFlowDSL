package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.dialogFlow.Entity;
import dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms;
import dk.sdu.mmmi.mdsd.dialogFlow.EntityValue;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class EntityCreator {
  private String systemName;
  
  public EntityCreator(final String systemName) {
    this.systemName = systemName;
  }
  
  public void generateEntity(final Entity entity, final IFileSystemAccess2 fsa) {
    this.createValues(entity, fsa);
    this.createMeta(entity, fsa);
  }
  
  private void createValues(final Entity entity, final IFileSystemAccess2 fsa) {
    String _name = entity.getName();
    String _plus = ((this.systemName + "/entities/") + _name);
    String _plus_1 = (_plus + "_entries_en.json");
    fsa.generateFile(_plus_1, 
      this.compileValues(entity));
  }
  
  private CharSequence compileValues(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    _builder.newLine();
    {
      EList<EntityValue> _entities = entity.getEntities();
      boolean _hasElements = false;
      for(final EntityValue value : _entities) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"value\": \"");
        String _value = value.getValue();
        _builder.append(_value, "\t\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"synonyms\": [");
        _builder.newLine();
        {
          EntitySynonyms _synonyms = value.getSynonyms();
          boolean _tripleNotEquals = (_synonyms != null);
          if (_tripleNotEquals) {
            {
              EList<String> _values = value.getSynonyms().getValues();
              boolean _hasElements_1 = false;
              for(final String synonym : _values) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(",", "\t\t\t");
                }
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\"");
                _builder.append(synonym, "\t\t\t");
                _builder.append("\"");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("]");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  private void createMeta(final Entity entity, final IFileSystemAccess2 fsa) {
    String _name = entity.getName();
    String _plus = ((this.systemName + "/entities/") + _name);
    String _plus_1 = (_plus + ".json");
    fsa.generateFile(_plus_1, 
      this.compileMeta(entity));
  }
  
  private CharSequence compileMeta(final Entity entity) {
    CharSequence _xblockexpression = null;
    {
      String id = UUID.randomUUID().toString();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"id\": \"");
      _builder.append(id, "\t");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("\"name\": \"");
      String _name = entity.getName();
      _builder.append(_name, "\t");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("\"isOverridable\": true,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"isEnum\": false,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"isRegexp\": false,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"automatedExpansion\": false,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"allowFuzzyExtraction\": false");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
