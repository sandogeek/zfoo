${protocol_root_path}
trait IProtocolRegistration {
  def protocolId: Short

  def write(buffer: ByteBuffer, packet: Any): Unit

  def read(buffer: ByteBuffer): Any
}