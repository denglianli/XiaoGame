//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from: BattleResult.proto
// Note: requires additional types generated from: Enums.proto
namespace message
{
  [global::System.Serializable, global::ProtoBuf.ProtoContract(Name=@"BattleResult")]
  public partial class BattleResult : global::ProtoBuf.IExtensible
  {
    public BattleResult() {}
    
    private message.Enums.Camp _camp = message.Enums.Camp.NoneCamp;
    [global::ProtoBuf.ProtoMember(1, IsRequired = false, Name=@"camp", DataFormat = global::ProtoBuf.DataFormat.TwosComplement)]
    [global::System.ComponentModel.DefaultValue(message.Enums.Camp.NoneCamp)]
    public message.Enums.Camp camp
    {
      get { return _camp; }
      set { _camp = value; }
    }
    private global::ProtoBuf.IExtension extensionObject;
    global::ProtoBuf.IExtension global::ProtoBuf.IExtensible.GetExtensionObject(bool createIfMissing)
      { return global::ProtoBuf.Extensible.GetExtensionObject(ref extensionObject, createIfMissing); }
  }
  
}