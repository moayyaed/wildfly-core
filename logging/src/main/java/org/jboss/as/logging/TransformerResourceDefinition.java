package org.jboss.as.logging;

import org.jboss.as.controller.SimpleResourceDefinition;
import org.jboss.as.controller.transform.description.ResourceTransformationDescriptionBuilder;

/**
 * Adds the ability to register transformers in a resource definition.
 *
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
public abstract class TransformerResourceDefinition extends SimpleResourceDefinition {

    /**
     * Creates a new resource definition.
     *
     * @param parameters the parameters used to construct the resource
     */
    protected TransformerResourceDefinition(final Parameters parameters) {
        super(parameters);
    }

    /**
     * Register the transformers for the resource.
     *
     * @param modelVersion          the model version we're registering
     * @param rootResourceBuilder   the builder for the root resource
     * @param loggingProfileBuilder the builder for the logging profile, {@code null} if the profile was rejected
     */
    public abstract void registerTransformers(KnownModelVersion modelVersion,
                                              ResourceTransformationDescriptionBuilder rootResourceBuilder,
                                              ResourceTransformationDescriptionBuilder loggingProfileBuilder);
}
