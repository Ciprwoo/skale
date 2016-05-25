package org.kframework.kale

trait MemoizedHashCode {
  lazy val cachedHashCode = computeHashCode
  override def hashCode = cachedHashCode
  def computeHashCode: Int
}
