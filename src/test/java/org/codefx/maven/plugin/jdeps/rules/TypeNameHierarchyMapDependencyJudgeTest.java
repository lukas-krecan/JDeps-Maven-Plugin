package org.codefx.maven.plugin.jdeps.rules;

import org.codefx.maven.plugin.jdeps.rules.TypeNameHierarchyMapDependencyJudge.TypeNameHierarchyMapDependencyJudgeBuilder;

/**
 * Tests for {@link TypeNameHierarchyMapDependencyJudge}.
 */
public class TypeNameHierarchyMapDependencyJudgeTest extends AbstractHierarchicalDependencyJudgeTest {

	@Override
	protected DependencyJudgeBuilder builder() {
		return new TypeNameHierarchyMapDependencyJudgeBuilder();
	}
}
