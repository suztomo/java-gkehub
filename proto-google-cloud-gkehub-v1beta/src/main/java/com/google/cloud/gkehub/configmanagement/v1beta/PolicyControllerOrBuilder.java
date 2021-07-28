/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

public interface PolicyControllerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.PolicyController)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Enables the installation of Policy Controller.
   * If false, the rest of PolicyController fields take no
   * effect.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Installs the default template library along with Policy Controller.
   * </pre>
   *
   * <code>bool template_library_installed = 2;</code>
   *
   * @return Whether the templateLibraryInstalled field is set.
   */
  boolean hasTemplateLibraryInstalled();
  /**
   *
   *
   * <pre>
   * Installs the default template library along with Policy Controller.
   * </pre>
   *
   * <code>bool template_library_installed = 2;</code>
   *
   * @return The templateLibraryInstalled.
   */
  boolean getTemplateLibraryInstalled();

  /**
   *
   *
   * <pre>
   * Sets the interval for Policy Controller Audit Scans (in seconds).
   * When set to 0, this disables audit functionality altogether.
   * </pre>
   *
   * <code>int64 audit_interval_seconds = 3;</code>
   *
   * @return Whether the auditIntervalSeconds field is set.
   */
  boolean hasAuditIntervalSeconds();
  /**
   *
   *
   * <pre>
   * Sets the interval for Policy Controller Audit Scans (in seconds).
   * When set to 0, this disables audit functionality altogether.
   * </pre>
   *
   * <code>int64 audit_interval_seconds = 3;</code>
   *
   * @return The auditIntervalSeconds.
   */
  long getAuditIntervalSeconds();

  /**
   *
   *
   * <pre>
   * The set of namespaces that are excluded from Policy Controller checks.
   * Namespaces do not need to currently exist on the cluster.
   * </pre>
   *
   * <code>repeated string exemptable_namespaces = 4;</code>
   *
   * @return A list containing the exemptableNamespaces.
   */
  java.util.List<java.lang.String> getExemptableNamespacesList();
  /**
   *
   *
   * <pre>
   * The set of namespaces that are excluded from Policy Controller checks.
   * Namespaces do not need to currently exist on the cluster.
   * </pre>
   *
   * <code>repeated string exemptable_namespaces = 4;</code>
   *
   * @return The count of exemptableNamespaces.
   */
  int getExemptableNamespacesCount();
  /**
   *
   *
   * <pre>
   * The set of namespaces that are excluded from Policy Controller checks.
   * Namespaces do not need to currently exist on the cluster.
   * </pre>
   *
   * <code>repeated string exemptable_namespaces = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The exemptableNamespaces at the given index.
   */
  java.lang.String getExemptableNamespaces(int index);
  /**
   *
   *
   * <pre>
   * The set of namespaces that are excluded from Policy Controller checks.
   * Namespaces do not need to currently exist on the cluster.
   * </pre>
   *
   * <code>repeated string exemptable_namespaces = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exemptableNamespaces at the given index.
   */
  com.google.protobuf.ByteString getExemptableNamespacesBytes(int index);

  /**
   *
   *
   * <pre>
   * Enables the ability to use Constraint Templates that reference to objects
   * other than the object currently being evaluated.
   * </pre>
   *
   * <code>bool referential_rules_enabled = 5;</code>
   *
   * @return The referentialRulesEnabled.
   */
  boolean getReferentialRulesEnabled();

  /**
   *
   *
   * <pre>
   * Logs all denies and dry run failures.
   * </pre>
   *
   * <code>bool log_denies_enabled = 6;</code>
   *
   * @return The logDeniesEnabled.
   */
  boolean getLogDeniesEnabled();
}