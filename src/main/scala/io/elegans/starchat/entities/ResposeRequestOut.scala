package io.elegans.starchat.entities

/**
  * Created by Angelo Leto <angelo.leto@elegans.io> on 27/06/16.
  */

import scala.collection.immutable.Map

case class ResponseRequestOut(bubble: String, action: String, data: Map[String, String], action_input: Map[String, String],
                                 success_value: String, failure_value: String)
