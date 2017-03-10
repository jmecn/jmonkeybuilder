package com.ss.editor;

import static java.util.ResourceBundle.getBundle;
import static rlib.util.ReflectionUtils.getUnsafeFieldValue;
import com.sun.javafx.scene.control.skin.resources.ControlResources;
import rlib.util.PropertyLoader;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * The class with all messages of this application.
 *
 * @author JavaSaBr
 */
public class Messages {

    public static final String BUNDLE_NAME = "messages/messages";

    public static final String EDITOR_BAR_ASSET;
    public static final String EDITOR_BAR_ASSET_OPEN_ASSET;
    public static final String EDITOR_BAR_ASSET_OPEN_ASSET_DIRECTORY_CHOOSER;
    public static final String EDITOR_BAR_ASSET_REOPEN_ASSET_FOLDER;
    public static final String EDITOR_BAR_ASSET_CLOSE_EDITOR;
    public static final String EDITOR_BAR_SETTINGS;
    public static final String EDITOR_TOOL_ASSET;

    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_NEW_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_OPEN_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_OPEN_WITH_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_COPY_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_CUT_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_PASTE_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_DELETE_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_DELETE_FILE_QUESTION;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_CONVERT_FILE;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_OPEN_FILE_BY_EXTERNAL_EDITOR;
    public static final String ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_RENAME_FILE;

    public static final String FILE_EDITOR_ACTION_SAVE;

    public static final String SCENE_FILE_EDITOR_ACTION_SELECTION;
    public static final String SCENE_FILE_EDITOR_ACTION_GRID;
    public static final String SCENE_FILE_EDITOR_ACTION_MOVE_TOOL;
    public static final String SCENE_FILE_EDITOR_ACTION_SCALE_TOOL;
    public static final String SCENE_FILE_EDITOR_ACTION_ROTATION_TOOL;
    public static final String SCENE_FILE_EDITOR_ACTION_CAMERA_LIGHT;
    public static final String SCENE_FILE_EDITOR_ACTION_SHOW_LIGHTS;
    public static final String SCENE_FILE_EDITOR_ACTION_SHOW_AUDIO;

    public static final String MATERIAL_FILE_EDITOR_ACTION_CUBE;
    public static final String MATERIAL_FILE_EDITOR_ACTION_SPHERE;
    public static final String MATERIAL_FILE_EDITOR_ACTION_PLANE;
    public static final String MATERIAL_FILE_EDITOR_ACTION_LIGHT;

    public static final String POST_FILTER_EDITOR_MATERIAL_LABEL;

    public static final String ASSET_EDITOR_DIALOG_TITLE;
    public static final String ASSET_EDITOR_DIALOG_BUTTON_OK;
    public static final String ASSET_EDITOR_DIALOG_BUTTON_CANCEL;

    public static final String PARTICLE_ASSET_EDITOR_DIALOG_TEXTURE_PARAM_LABEL;
    public static final String PARTICLE_ASSET_EDITOR_DIALOG_LIGHTING_TRANSFORM_LABEL;

    public static final String MATERIAL_EDITOR_MATERIAL_TYPE_LABEL;
    public static final String MATERIAL_FILE_EDITOR_BUCKET_TYPE_LABEL;

    public static final String MATERIAL_FILE_EDITOR_TEXTURES_COMPONENT_TITLE;
    public static final String MATERIAL_FILE_EDITOR_COLORS_COMPONENT_TITLE;
    public static final String MATERIAL_FILE_EDITOR_OTHER_COMPONENT_TITLE;
    public static final String MATERIAL_FILE_EDITOR_RENDER_PARAMS_COMPONENT_TITLE;

    public static final String TEXTURE_2D_MATERIAL_PARAM_CONTROL_REPEAT;
    public static final String TEXTURE_2D_MATERIAL_PARAM_CONTROL_FLIP;
    public static final String TEXTURE_2D_MATERIAL_PARAM_CONTROL_ADD;
    public static final String TEXTURE_2D_MATERIAL_PARAM_CONTROL_REMOVE;

    public static final String COLOR_MATERIAL_PARAM_CONTROL_REMOVE;

    public static final String MATERIAL_RENDER_STATE_FACE_CULL_MODE;
    public static final String MATERIAL_RENDER_STATE_BLEND_MODE;
    public static final String MATERIAL_RENDER_STATE_POLY_OFFSET_FACTOR;
    public static final String MATERIAL_RENDER_STATE_POLY_OFFSET_UNITS;
    public static final String MATERIAL_RENDER_STATE_POINT_SPRITE;
    public static final String MATERIAL_RENDER_STATE_DEPTH_WRITE;
    public static final String MATERIAL_RENDER_STATE_COLOR_WRITE;
    public static final String MATERIAL_RENDER_STATE_DEPTH_TEST;
    public static final String MATERIAL_RENDER_STATE_WIREFRAME;

    public static final String TEXT_FILE_EDITOR_NAME;
    public static final String POST_FILTER_EDITOR_NAME;
    public static final String MATERIAL_EDITOR_NAME;

    public static final String FILE_CREATOR_BUTTON_OK;
    public static final String FILE_CREATOR_FILE_NAME_LABEL;

    public static final String MATERIAL_FILE_CREATOR_TITLE;
    public static final String MATERIAL_FILE_CREATOR_MATERIAL_TYPE_LABEL;
    public static final String MATERIAL_FILE_CREATOR_FILE_DESCRIPTION;

    public static final String SINGLE_COLOR_TEXTURE_FILE_CREATOR_TITLE;
    public static final String SINGLE_COLOR_TEXTURE_FILE_CREATOR_WIDTH;
    public static final String SINGLE_COLOR_TEXTURE_FILE_CREATOR_HEIGHT;
    public static final String SINGLE_COLOR_TEXTURE_FILE_CREATOR_COLOR;
    public static final String SINGLE_COLOR_TEXTURE_FILE_CREATOR_DESCRIPTION;

    public static final String POST_FILTER_VIEW_FILE_CREATOR_TITLE;
    public static final String POST_FILTER_VIEW_FILE_CREATOR_FILE_DESCRIPTION;

    public static final String SETTINGS_DIALOG_TITLE;
    public static final String SETTINGS_DIALOG_FXAA;
    public static final String SETTINGS_DIALOG_DECORATED;
    public static final String SETTINGS_DIALOG_FRAME_RATE;
    public static final String SETTINGS_DIALOG_GAMMA_CORRECTION;
    public static final String SETTINGS_DIALOG_TONEMAP_FILTER;
    public static final String SETTINGS_DIALOG_TONEMAP_FILTER_WHITE_POINT;
    public static final String SETTINGS_DIALOG_ANISOTROPY;
    public static final String SETTINGS_DIALOG_BUTTON_OK;
    public static final String SETTINGS_DIALOG_BUTTON_CANCEL;
    public static final String SETTINGS_DIALOG_MESSAGE;
    public static final String SETTINGS_DIALOG_GOOGLE_ANALYTICS;
    public static final String SETTINGS_DIALOG_CAMERA_ANGLE;
    public static final String SETTINGS_DIALOG_AUTO_TANGENT_GENERATING;
    public static final String SETTINGS_DIALOG_DEFAULT_FLIPPED_TEXTURE;
    public static final String SETTINGS_DIALOG_DEFAULT_EDITOR_CAMERA_LAMP_ENABLED;
    public static final String SETTINGS_DIALOG_TAB_GRAPHICS;
    public static final String SETTINGS_DIALOG_TAB_OTHER;
    public static final String SETTINGS_DIALOG_CLASSPATH_FOLDER_LABEL;
    public static final String SETTINGS_DIALOG_CLASSPATH_FOLDER_CHOOSER_TITLE;
    public static final String SETTINGS_DIALOG_ENVS_FOLDER_LABEL;
    public static final String SETTINGS_DIALOG_ENVS_FOLDER_CHOOSER_TITLE;

    public static final String BLEND_TO_J3O_FILE_CONVERTER_DESCRIPTION;
    public static final String FBX_TO_J3O_FILE_CONVERTER_DESCRIPTION;
    public static final String OBJ_TO_J3O_FILE_CONVERTER_DESCRIPTION;
    public static final String XBUF_TO_J3O_FILE_CONVERTER_DESCRIPTION;
    public static final String SCENE_TO_J3O_FILE_CONVERTER_DESCRIPTION;
    public static final String MESH_XML_TO_J3O_FILE_CONVERTER_DESCRIPTION;

    public static final String MODEL_FILE_EDITOR_NAME;
    public static final String MODEL_FILE_EDITOR_NO_SKY;
    public static final String MODEL_FILE_EDITOR_FAST_SKY;
    public static final String MODEL_FILE_EDITOR_NODE_MESH;
    public static final String MODEL_FILE_EDITOR_NODE_AMBIENT_LIGHT;
    public static final String MODEL_FILE_EDITOR_NODE_DIRECTION_LIGHT;
    public static final String MODEL_FILE_EDITOR_NODE_POINT_LIGHT;
    public static final String MODEL_FILE_EDITOR_NODE_SPOT_LIGHT;
    public static final String MODEL_FILE_EDITOR_NODE_LIGHT_PROBE;
    public static final String MODEL_FILE_EDITOR_NODE_ANIM_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_EMITTER_INFLUENCERS;
    public static final String MODEL_FILE_EDITOR_NODE_STATIC_RIGID_BODY_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_RIGID_BODY_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_CHARACTER_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_SKELETON_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_VEHICLE_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_RAGDOLL_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_BOX_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_CAPSULE_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_CHILD_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_COMPUTED_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_CONE_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_CYLINDER_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_GIMPACT_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_HEIGHT_FIELD_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_HULL_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_MESH_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_PLANE_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_SPHERE_COLLISION_SHAPE;
    public static final String MODEL_FILE_EDITOR_NODE_WHEEL;
    public static final String MODEL_FILE_EDITOR_NODE_MOTION_CONTROL;
    public static final String MODEL_FILE_EDITOR_NODE_MOTION_PATH;
    public static final String MODEL_FILE_EDITOR_NODE_WAY_POINT;
    public static final String MODEL_FILE_EDITOR_NODE_VERTEX_BUFFER;

    public static final String SCENE_FILE_EDITOR_NAME;
    public static final String SCENE_FILE_EDITOR_TOOL_OBJECTS;
    public static final String SCENE_FILE_EDITOR_TOOL_EDITING;
    public static final String SCENE_FILE_EDITOR_TOOL_APP_STATES;
    public static final String SCENE_FILE_EDITOR_TOOL_FILTERS;
    public static final String SCENE_FILE_EDITOR_TOOL_LAYERS;

    public static final String MODEL_NODE_TREE_ACTION_REMOVE;
    public static final String MODEL_NODE_TREE_ACTION_RENAME;
    public static final String MODEL_NODE_TREE_ACTION_OPTIMIZE_GEOMETRY;
    public static final String MODEL_NODE_TREE_ACTION_TOOLS;
    public static final String MODEL_NODE_TREE_ACTION_CREATE;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_NODE;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_SKY;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE_BOX;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE_SPHERE;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE_QUAD;
    public static final String MODEL_NODE_TREE_ACTION_LOAD_MODEL;
    public static final String MODEL_NODE_TREE_ACTION_LINK_MODEL;
    public static final String MODEL_NODE_TREE_ACTION_TANGENT_GENERATOR;
    public static final String MODEL_NODE_TREE_ACTION_LOD_GENERATOR;
    public static final String MODEL_NODE_TREE_ACTION_LIGHT;
    public static final String MODEL_NODE_TREE_ACTION_AMBIENT_LIGHT;
    public static final String MODEL_NODE_TREE_ACTION_DIRECTION_LIGHT;
    public static final String MODEL_NODE_TREE_ACTION_POINT_LIGHT;
    public static final String MODEL_NODE_TREE_ACTION_SPOT_LIGHT;
    public static final String MODEL_NODE_TREE_ACTION_ANIMATION_PLAY;
    public static final String MODEL_NODE_TREE_ACTION_ANIMATION_PLAY_SETTINGS;
    public static final String MODEL_NODE_TREE_ACTION_ANIMATION_STOP;
    public static final String MODEL_NODE_TREE_ACTION_ANIMATION_MANUAL_EXTRAXT_SUB_ANIMATION;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_AUDIO_NODE;
    public static final String MODEL_NODE_TREE_ACTION_AUDIO_PLAY;
    public static final String MODEL_NODE_TREE_ACTION_AUDIO_STOP;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_TEMITTER;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_SOFT_TEMITTER;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_TRIANGLE_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_BOX_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_CYLINDER_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_DOME_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_QUAD_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_SPHERE_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_TORUS_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_MODEL_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_QUAD;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_POINT;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_IMPOSTOR;
    public static final String MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_MODEL;
    public static final String MODEL_NODE_TREE_ACTION_CREATE_LAYER;
    public static final String MODEL_NODE_TREE_ACTION_ADD_USER_DATA;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL_RIGID_BODY;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL_STATIC_RIGID_BODY;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL_NOTION;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL_CHARACTER;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL_CUSTOM;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL_VEHICLE;
    public static final String MODEL_NODE_TREE_ACTION_ADD_CONTROL_KINEMATIC_RAGDOLL;
    public static final String MODEL_NODE_TREE_ACTION_REACTIVATE;
    public static final String MODEL_NODE_TREE_ACTION_CHANGE_COLLISION_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_GENERATE_COLLISION_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_BOX_COLLISION_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_CAPSULE_COLLISION_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_CONE_COLLISION_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_CYLINDER_COLLISION_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_SPHERE_COLLISION_SHAPE;
    public static final String MODEL_NODE_TREE_ACTION_ADD_WHEEL;
    public static final String MODEL_NODE_TREE_ACTION_ADD_TERRAIN;

    public static final String MODEL_PROPERTY_CULL_HINT;
    public static final String MODEL_PROPERTY_SHADOW_MODE;
    public static final String MODEL_PROPERTY_QUEUE_BUCKET;
    public static final String MODEL_PROPERTY_LOCATION;
    public static final String MODEL_PROPERTY_SCALE;
    public static final String MODEL_PROPERTY_ROTATION;
    public static final String MODEL_PROPERTY_MATERIAL;
    public static final String MODEL_PROPERTY_DIRECTION;
    public static final String MODEL_PROPERTY_RADIUS;
    public static final String MODEL_PROPERTY_COLOR;
    public static final String MODEL_PROPERTY_INNER_ANGLE;
    public static final String MODEL_PROPERTY_OUTER_ANGLE;
    public static final String MODEL_PROPERTY_MIN;
    public static final String MODEL_PROPERTY_MAX;
    public static final String MODEL_PROPERTY_LOOPING;
    public static final String MODEL_PROPERTY_REVERB;
    public static final String MODEL_PROPERTY_DIRECTIONAL;
    public static final String MODEL_PROPERTY_POSITIONAL;
    public static final String MODEL_PROPERTY_AUDIO_PITCH;
    public static final String MODEL_PROPERTY_AUDIO_VOLUME;
    public static final String MODEL_PROPERTY_TIME_OFFSET;
    public static final String MODEL_PROPERTY_MAX_DISTANCE;
    public static final String MODEL_PROPERTY_REF_DISTANCE;
    public static final String MODEL_PROPERTY_AUDIO_DATA;
    public static final String MODEL_PROPERTY_VELOCITY;
    public static final String MODEL_PROPERTY_LOD;
    public static final String MODEL_PROPERTY_TRIANGLE_COUNT;
    public static final String MODEL_PROPERTY_LEVEL;
    public static final String MODEL_PROPERTY_LAYER;
    public static final String MODEL_PROPERTY_VALUE;
    public static final String MODEL_PROPERTY_ID;
    public static final String MODEL_PROPERTY_INSTANCE_COUNT;
    public static final String MODEL_PROPERTY_VERTEX_COUNT;
    public static final String MODEL_PROPERTY_NUM_LOD_LEVELS;
    public static final String MODEL_PROPERTY_MODE;
    public static final String MODEL_PROPERTY_TYPE;
    public static final String MODEL_PROPERTY_FORMAT;
    public static final String MODEL_PROPERTY_USAGE;
    public static final String MODEL_PROPERTY_UNIQ_ID;
    public static final String MODEL_PROPERTY_BASE_INSTANCE_COUNT;
    public static final String MODEL_PROPERTY_INSTANCE_SPAN;
    public static final String MODEL_PROPERTY_NUM_COMPONENTS;
    public static final String MODEL_PROPERTY_NUM_ELEMENTS;
    public static final String MODEL_PROPERTY_OFFSET;
    public static final String MODEL_PROPERTY_STRIDE;
    public static final String MODEL_PROPERTY_CAPACITY;

    public static final String CONTROL_PROPERTY_ENABLED;
    public static final String CONTROL_PROPERTY_HARDWARE_SKINNING_PREFERRED;
    public static final String CONTROL_PROPERTY_VIEW_DIRECTION;
    public static final String CONTROL_PROPERTY_WALK_DIRECTION;
    public static final String CONTROL_PROPERTY_FALL_SPEED;
    public static final String CONTROL_PROPERTY_GRAVITY;
    public static final String CONTROL_PROPERTY_JUMP_SPEED;
    public static final String CONTROL_PROPERTY_MAX_SLOPE;
    public static final String CONTROL_PROPERTY_APPLY_PHYSICS_LOCAL;
    public static final String CONTROL_PROPERTY_USE_VIEW_DIRECTION;
    public static final String CONTROL_PROPERTY_KINEMATIC_SPATIAL;
    public static final String CONTROL_PROPERTY_KINEMATIC;
    public static final String CONTROL_PROPERTY_ANGULAR_VELOCITY;
    public static final String CONTROL_PROPERTY_LINEAR_FACTOR;
    public static final String CONTROL_PROPERTY_ANGULAR_DAMPING;
    public static final String CONTROL_PROPERTY_ANGULAR_FACTOR;
    public static final String CONTROL_PROPERTY_FRICTION;
    public static final String CONTROL_PROPERTY_LINEAR_DAMPING;
    public static final String CONTROL_PROPERTY_MASS;
    public static final String CONTROL_PROPERTY_RESTITUTION;
    public static final String CONTROL_PROPERTY_CURRENT_VALUE;
    public static final String CONTROL_PROPERTY_CURRENT_WAY_POINT;
    public static final String CONTROL_PROPERTY_DIRECTION_TYPE;
    public static final String CONTROL_PROPERTY_DIRECTION;
    public static final String CONTROL_PROPERTY_ROTATION;
    public static final String CONTROL_PROPERTY_ANGULAR_SLEEPING_THRESHOLD;
    public static final String CONTROL_PROPERTY_LOOP_MODE;
    public static final String CONTROL_PROPERTY_INITIAL_DURATION;
    public static final String CONTROL_PROPERTY_SPEED;
    public static final String CONTROL_PROPERTY_TIME;
    public static final String CONTROL_PROPERTY_MARGIN;
    public static final String CONTROL_PROPERTY_LOCATION;
    public static final String CONTROL_PROPERTY_HALF_EXTENTS;
    public static final String CONTROL_PROPERTY_RADIUS;
    public static final String CONTROL_PROPERTY_HEIGHT;
    public static final String CONTROL_PROPERTY_AXIS;
    public static final String CONTROL_PROPERTY_SCALE;
    public static final String CONTROL_PROPERTY_OBJECT_ID;
    public static final String CONTROL_PROPERTY_AXLE;
    public static final String CONTROL_PROPERTY_REST_LENGTH;
    public static final String CONTROL_PROPERTY_FRONT;
    public static final String CONTROL_PROPERTY_DAMPING_COMPRESSION;
    public static final String CONTROL_PROPERTY_FRICTION_SLIP;
    public static final String CONTROL_PROPERTY_MAX_SUSPENSION_FORCE;
    public static final String CONTROL_PROPERTY_MAX_SUSPENSION_TRAVEL_CM;
    public static final String CONTROL_PROPERTY_DAMPING_RELAXATION;
    public static final String CONTROL_PROPERTY_SUSPENSION_STIFFNESS;
    public static final String CONTROL_PROPERTY_ROLL_INFLUENCE;
    public static final String CONTROL_PROPERTY_WHEEL_SPATIAL;

    public static final String PARTICLE_EMITTER_TEST_MODE;
    public static final String PARTICLE_EMITTER_ENABLED;
    public static final String PARTICLE_EMITTER_RANDOM_POINT;
    public static final String PARTICLE_EMITTER_SEQUENTIAL_FACE;
    public static final String PARTICLE_EMITTER_SKIP_PATTERN;
    public static final String PARTICLE_EMITTER_DIRECTION_TYPE;
    public static final String PARTICLE_EMITTER_EMISSION_POINT;
    public static final String PARTICLE_EMITTER_MAX_PARTICLES;
    public static final String PARTICLE_EMITTER_EMISSION_PER_SECOND;
    public static final String PARTICLE_EMITTER_PARTICLES_PER_SECOND;
    public static final String PARTICLE_EMITTER_EMITTER_LIFE;
    public static final String PARTICLE_EMITTER_TEST_PARTICLES;
    public static final String PARTICLE_EMITTER_FOLLOW_EMITTER;
    public static final String PARTICLE_EMITTER_STRETCHING;
    public static final String PARTICLE_EMITTER_MAGNITUDE;
    public static final String PARTICLE_EMITTER_BILLBOARD;
    public static final String PARTICLE_EMITTER_INITIAL_FORCE;
    public static final String PARTICLE_EMITTER_LIFE;
    public static final String PARTICLE_EMITTER_COLUMNS;
    public static final String PARTICLE_EMITTER_ROWS;
    public static final String PARTICLE_EMITTER_SPRITE_COUNT;
    public static final String PARTICLE_EMITTER_INFLUENCER_FIXED_DURATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_RANDOM_START_COLOR;
    public static final String PARTICLE_EMITTER_INFLUENCER_RANDOM_START_SIZE;
    public static final String PARTICLE_EMITTER_INFLUENCER_SIZE_VARIATION_FACTOR;
    public static final String PARTICLE_EMITTER_INFLUENCER_RANDOM_START_DESTINATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_CHANCE;
    public static final String PARTICLE_EMITTER_INFLUENCER_STRENGTH;
    public static final String PARTICLE_EMITTER_INFLUENCER_MAGNITUDE;
    public static final String PARTICLE_EMITTER_INFLUENCER_GRAVITY;
    public static final String PARTICLE_EMITTER_INFLUENCER_ALIGNMENT;
    public static final String PARTICLE_EMITTER_INFLUENCER_RANDOM_DIRECTION;
    public static final String PARTICLE_EMITTER_INFLUENCER_PULL_CENTER;
    public static final String PARTICLE_EMITTER_INFLUENCER_PULL_ALIGNMENT;
    public static final String PARTICLE_EMITTER_INFLUENCER_UP_ALIGNMENT;
    public static final String PARTICLE_EMITTER_INFLUENCER_RADIAL_PULL;
    public static final String PARTICLE_EMITTER_INFLUENCER_TANGENT_FORCE;
    public static final String PARTICLE_EMITTER_INFLUENCER_ALPHA_INTERPOLATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_COLOR_INTERPOLATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_DESTINATION_INTERPOLATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_ROTATION_INTERPOLATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_SIZE_INTERPOLATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_ALPHA;
    public static final String PARTICLE_EMITTER_INFLUENCER_COLOR;
    public static final String PARTICLE_EMITTER_INFLUENCER_SPEED;
    public static final String PARTICLE_EMITTER_INFLUENCER_SIZE;
    public static final String PARTICLE_EMITTER_INFLUENCER_FRAME_SEQUENCE;
    public static final String PARTICLE_EMITTER_INFLUENCER_RANDOM_START_IMAGE;
    public static final String PARTICLE_EMITTER_INFLUENCER_ANIMATE;
    public static final String PARTICLE_EMITTER_INFLUENCER_REACTION;
    public static final String PARTICLE_EMITTER_INFLUENCER_RESTITUTION;
    public static final String PARTICLE_EMITTER_INFLUENCER_RANDOM_SPEED;
    public static final String PARTICLE_EMITTER_INFLUENCER_START_RANDOM_ROTATION_X;
    public static final String PARTICLE_EMITTER_INFLUENCER_INTERPOLATION;
    public static final String PARTICLE_EMITTER_INFLUENCER_GEOMETRY_LIST;
    public static final String PARTICLE_EMITTER_INFLUENCER_GEOMETRY;

    public static final String MATERIAL_MODEL_PROPERTY_CONTROL_NO_TEXTURE;
    public static final String MATERIAL_MODEL_PROPERTY_CONTROL_NO_MATERIAL;
    public static final String ABSTRACT_ELEMENT_PROPERTY_CONTROL_NO_ELEMENT;
    public static final String LAYER_PROPERTY_CONTROL_NO_LAYER;
    public static final String AUDIO_KEY_PROPERTY_CONTROL_NO_AUDIO;
    public static final String CHOOSE_FOLDER_CONTROL_NO_FOLDER;

    public static final String RENAME_DIALOG_TITLE;
    public static final String RENAME_DIALOG_NEW_NAME_LABEL;
    public static final String RENAME_DIALOG_BUTTON_OK;
    public static final String RENAME_DIALOG_BUTTON_CANCEL;

    public static final String PLAY_ANIMATION_SETTINGS_DIALOG_TITLE;
    public static final String PLAY_ANIMATION_SETTINGS_DIALOG_LOOP_MODE;
    public static final String PLAY_ANIMATION_SETTINGS_DIALOG_SPEED;
    public static final String PLAY_ANIMATION_SETTINGS_DIALOG_BUTTON_OK;

    public static final String MANUAL_EXTRACT_ANIMATION_DIALOG_TITLE;
    public static final String MANUAL_EXTRACT_ANIMATION_DIALOG_NAME;
    public static final String MANUAL_EXTRACT_ANIMATION_DIALOG_NAME_EXAMPLE;
    public static final String MANUAL_EXTRACT_ANIMATION_DIALOG_START_FRAME;
    public static final String MANUAL_EXTRACT_ANIMATION_DIALOG_END_FRAME;
    public static final String MANUAL_EXTRACT_ANIMATION_DIALOG_BUTTON_OK;

    public static final String QUESTION_DIALOG_TITLE;
    public static final String QUESTION_DIALOG_BUTTON_OK;
    public static final String QUESTION_DIALOG_BUTTON_CANCEL;

    public static final String FOLDER_CREATOR_DESCRIPTION;
    public static final String FOLDER_CREATOR_TITLE;
    public static final String FOLDER_CREATOR_FILE_NAME_LABEL;

    public static final String EMPTY_FILE_CREATOR_DESCRIPTION;
    public static final String EMPTY_FILE_CREATOR_TITLE;

    public static final String IMAGE_VIEWER_EDITOR_NAME;

    public static final String AUDIO_VIEWER_EDITOR_NAME;
    public static final String AUDIO_VIEWER_EDITOR_DURATION_LABEL;
    public static final String AUDIO_VIEWER_EDITOR_BITS_PER_SAMPLE_LABEL;
    public static final String AUDIO_VIEWER_EDITOR_CHANNELS_LABEL;
    public static final String AUDIO_VIEWER_EDITOR_DATA_TYPE_LABEL;
    public static final String AUDIO_VIEWER_EDITOR_SAMPLE_RATE_LABEL;

    public static final String CREATE_SKY_DIALOG_TITLE;
    public static final String CREATE_SKY_DIALOG_SKY_TYPE_SINGLE;
    public static final String CREATE_SKY_DIALOG_SKY_TYPE_MULTIPLE;
    public static final String CREATE_SKY_DIALOG_SKY_TYPE_LABEL;
    public static final String CREATE_SKY_DIALOG_NORMAL_SCALE_LABEL;
    public static final String CREATE_SKY_DIALOG_TEXTURE_LABEL;
    public static final String CREATE_SKY_DIALOG_TEXTURE_TYPE_LABEL;
    public static final String CREATE_SKY_DIALOG_FLIP_Y_LABEL;
    public static final String CREATE_SKY_DIALOG_NORTH_LABEL;
    public static final String CREATE_SKY_DIALOG_SOUTH_LABEL;
    public static final String CREATE_SKY_DIALOG_EAST_LABEL;
    public static final String CREATE_SKY_DIALOG_WEST_LABEL;
    public static final String CREATE_SKY_DIALOG_TOP_LABEL;
    public static final String CREATE_SKY_DIALOG_BOTTOM_LABEL;

    public static final String SIMPLE_DIALOG_BUTTON_OK;
    public static final String SIMPLE_DIALOG_BUTTON_CANCEL;

    public static final String EMPTY_MODEL_CREATOR_DESCRIPTION;
    public static final String EMPTY_MODEL_CREATOR_TITLE;

    public static final String EMPTY_SCENE_CREATOR_DESCRIPTION;
    public static final String EMPTY_SCENE_CREATOR_TITLE;

    public static final String GLSL_FILE_EDITOR_NAME;
    public static final String MATERIAL_DEFINITION_FILE_EDITOR_NAME;

    public static final String GENERATE_TANGENTS_DIALOG_SPLIT_MIRRORED;
    public static final String GENERATE_TANGENTS_DIALOG_ALGORITHM_LABEL;
    public static final String GENERATE_TANGENTS_DIALOG_TITLE;
    public static final String GENERATE_TANGENTS_DIALOG_BUTTON_OK;

    public static final String GENERATE_LOD_DIALOG_TITLE;
    public static final String GENERATE_LOD_DIALOG_METHOD;
    public static final String GENERATE_LOD_DIALOG_BUTTON_GENERATE;

    public static final String BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_NAME;
    public static final String BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_SPHERE;
    public static final String BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_SPHERE_RADIUS;
    public static final String BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_BOX;

    public static final String NODE_SELECTOR_DIALOG_TITLE;
    public static final String NODE_SELECTOR_DIALOG_BUTTON;

    public static final String GEOMETRY_SELECTOR_DIALOG_TITLE;
    public static final String LIGHT_SELECTOR_DIALOG_TITLE;

    public static final String LOG_VIEW_TITLE;

    public static final String CREATE_SCENE_APP_STATE_DIALOG_TITLE;
    public static final String CREATE_SCENE_APP_STATE_DIALOG_BUILT_IN;
    public static final String CREATE_SCENE_APP_STATE_DIALOG_CUSTOM_BOX;
    public static final String CREATE_SCENE_APP_STATE_DIALOG_CUSTOM_FIELD;

    public static final String CREATE_SCENE_FILTER_DIALOG_TITLE;
    public static final String CREATE_SCENE_FILTER_DIALOG_BUILT_IN;
    public static final String CREATE_SCENE_FILTER_DIALOG_CUSTOM_BOX;
    public static final String CREATE_SCENE_FILTER_DIALOG_CUSTOM_FIELD;

    public static final String ADD_USER_DATA_DIALOG_TITLE;
    public static final String ADD_USER_DATA_DIALOG_NAME;
    public static final String ADD_USER_DATA_DIALOG_DATA_TYPE;
    public static final String ADD_USER_DATA_DIALOG_BUTTON_OK;

    public static final String CREATE_CUSTOM_CONTROL_DIALOG_TITLE;
    public static final String CREATE_CUSTOM_CONTROL_DIALOG_BUILT_IN;
    public static final String CREATE_CUSTOM_CONTROL_DIALOG_CUSTOM_BOX;
    public static final String CREATE_CUSTOM_CONTROL_DIALOG_CUSTOM_FIELD;

    public static final String ANALYTICS_CONFIRM_DIALOG_MESSAGE;

    public static final String CREATE_BOX_COLLISION_SHAPE_DIALOG_TITLE;
    public static final String CREATE_SPHERE_COLLISION_SHAPE_DIALOG_TITLE;
    public static final String CREATE_CYLINDER_COLLISION_SHAPE_DIALOG_TITLE;
    public static final String CREATE_CONE_COLLISION_SHAPE_DIALOG_TITLE;
    public static final String CREATE_CAPSULE_COLLISION_SHAPE_DIALOG_TITLE;

    public static final String ADD_VEHICLE_WHEEL_DIALOG_TITLE;

    public static final String CREATE_TERRAIN_DIALOG_TITLE;
    public static final String CREATE_TERRAIN_DIALOG_BASE_TEXTURE;
    public static final String CREATE_TERRAIN_DIALOG_FOLDER_ALPHA_TEXTURE;
    public static final String CREATE_TERRAIN_DIALOG_TOTAL_SIZE;
    public static final String CREATE_TERRAIN_DIALOG_PATCH_SIZE;
    public static final String CREATE_TERRAIN_DIALOG_ALPHA_BLEND_TEXTURE_SIZE;
    public static final String CREATE_TERRAIN_DIALOG_TERRAIN_TYPE;
    public static final String CREATE_TERRAIN_DIALOG_TERRAIN_TYPE_FLAT;
    public static final String CREATE_TERRAIN_DIALOG_TERRAIN_TYPE_IMAGE_BASED;
    public static final String CREATE_TERRAIN_DIALOG_TERRAIN_TYPE_HILL;
    public static final String CREATE_TERRAIN_DIALOG_HEIGHT_MAP_IMAGE;
    public static final String CREATE_TERRAIN_DIALOG_HEIGHT_SMOOTH;
    public static final String CREATE_TERRAIN_DIALOG_HEIGHT_SCALE;
    public static final String CREATE_TERRAIN_DIALOG_ITERATIONS;
    public static final String CREATE_TERRAIN_DIALOG_FLATTENING;
    public static final String CREATE_TERRAIN_DIALOG_MIN_RADIUS;
    public static final String CREATE_TERRAIN_DIALOG_MAX_RADIUS;

    public static final String EDITING_COMPONENT_BRUSH_SIZE;
    public static final String EDITING_COMPONENT_BRUSH_POWER;
    public static final String EDITING_COMPONENT_SMOOTHLY;
    public static final String EDITING_COMPONENT_LIMITED;
    public static final String EDITING_COMPONENT_USE_MARKER;
    public static final String EDITING_COMPONENT_LEVEL;
    public static final String EDITING_COMPONENT_ROUGHNESS;
    public static final String EDITING_COMPONENT_FREQUENCY;
    public static final String EDITING_COMPONENT_LACUNARITY;
    public static final String EDITING_COMPONENT_OCTAVES;
    public static final String EDITING_COMPONENT_SCALE;
    public static final String EDITING_COMPONENT_TRI_PLANAR;
    public static final String EDITING_COMPONENT_SHININESS;
    public static final String EDITING_COMPONENT_LAYER;

    public static final String MODEL_CONVERTER_DIALOG_TITLE;
    public static final String MODEL_CONVERTER_DIALOG_RESULT_NAME;
    public static final String MODEL_CONVERTER_DIALOG_DESTINATION_FOLDER;
    public static final String MODEL_CONVERTER_DIALOG_EXPORT_MATERIALS;
    public static final String MODEL_CONVERTER_DIALOG_MATERIAL_FOLDER;
    public static final String MODEL_CONVERTER_DIALOG_OVERWRITE_MATERIALS;
    public static final String MODEL_CONVERTER_DIALOG_BUTTON_OK;

    public static final String FILE_DELETE_HANDLER_DELETE_MATERIALS;

    static {

        final Locale locale = Locale.getDefault();
        final ClassLoader classLoader = ControlResources.class.getClassLoader();

        final ResourceBundle controlBundle = getBundle("com/sun/javafx/scene/control/skin/resources/controls",
                locale, classLoader, PropertyLoader.getInstance());

        final ResourceBundle overrideBundle = getBundle("com/sun/javafx/scene/control/skin/resources/controls",
                PropertyLoader.getInstance());

        final Map override = getUnsafeFieldValue(overrideBundle, "lookup");
        final Map original = getUnsafeFieldValue(controlBundle, "lookup");

        //noinspection ConstantConditions,ConstantConditions,unchecked
        original.putAll(override);

        final ResourceBundle bundle = getBundle(BUNDLE_NAME, PropertyLoader.getInstance());

        EDITOR_BAR_ASSET = bundle.getString("EditorBarComponentAsset");
        EDITOR_BAR_ASSET_OPEN_ASSET = bundle.getString("EditorBarComponentAssetOpenAsset");

        EDITOR_BAR_ASSET_OPEN_ASSET_DIRECTORY_CHOOSER = bundle.getString("EditorBarComponentAssetOpenAssetDirectoryChooser");

        EDITOR_BAR_ASSET_REOPEN_ASSET_FOLDER = bundle.getString("EditorBarComponentAssetReopen");
        EDITOR_BAR_ASSET_CLOSE_EDITOR = bundle.getString("EditorBarComponentAssetClose");

        EDITOR_BAR_SETTINGS = bundle.getString("EditorBarComponent.settings");
        EDITOR_TOOL_ASSET = bundle.getString("EditorToolAsset");

        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_NEW_FILE = bundle.getString("AssetComponentResourceTreeContextMenuNewFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_OPEN_FILE = bundle.getString("AssetComponentResourceTreeContextMenuOpenFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_OPEN_WITH_FILE = bundle.getString("AssetComponentResourceTreeContextMenuOpenWithFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_COPY_FILE = bundle.getString("AssetComponentResourceTreeContextMenuCopyFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_CUT_FILE = bundle.getString("AssetComponentResourceTreeContextMenuCutFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_PASTE_FILE = bundle.getString("AssetComponentResourceTreeContextMenuPasteFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_DELETE_FILE = bundle.getString("AssetComponentResourceTreeContextMenuDeleteFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_DELETE_FILE_QUESTION = bundle.getString("AssetComponentResourceTreeContextMenuDeleteFileQuestion");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_CONVERT_FILE = bundle.getString("AssetComponentResourceTreeContextMenuConvertFile");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_OPEN_FILE_BY_EXTERNAL_EDITOR = bundle.getString("AssetComponentResourceTreeContextMenuOpenFileByExternalEditor");
        ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_RENAME_FILE = bundle.getString("AssetComponentResourceTreeContextMenuRenameFile");

        FILE_EDITOR_ACTION_SAVE = bundle.getString("FileEditorActionSave");

        SCENE_FILE_EDITOR_ACTION_SELECTION = bundle.getString("SceneFileEditorActionSelection");
        SCENE_FILE_EDITOR_ACTION_GRID = bundle.getString("SceneFileEditorActionGrid");
        SCENE_FILE_EDITOR_ACTION_MOVE_TOOL = bundle.getString("SceneFileEditorActionMoveTool");
        SCENE_FILE_EDITOR_ACTION_SCALE_TOOL = bundle.getString("SceneFileEditorActionScaleTool");
        SCENE_FILE_EDITOR_ACTION_ROTATION_TOOL = bundle.getString("SceneFileEditorActionRotationTool");
        SCENE_FILE_EDITOR_ACTION_CAMERA_LIGHT = bundle.getString("SceneFileEditorActionCameraLight");
        SCENE_FILE_EDITOR_ACTION_SHOW_LIGHTS = bundle.getString("SceneFileEditorActionShowLights");
        SCENE_FILE_EDITOR_ACTION_SHOW_AUDIO = bundle.getString("SceneFileEditorActionShowAudio");

        MATERIAL_FILE_EDITOR_ACTION_CUBE = bundle.getString("MaterialFileEditorActionCube");
        MATERIAL_FILE_EDITOR_ACTION_SPHERE = bundle.getString("MaterialFileEditorActionSphere");
        MATERIAL_FILE_EDITOR_ACTION_PLANE = bundle.getString("MaterialFileEditorActionPlane");
        MATERIAL_FILE_EDITOR_ACTION_LIGHT = bundle.getString("MaterialFileEditorActionLight");

        POST_FILTER_EDITOR_MATERIAL_LABEL = bundle.getString("PostFilterEditorMaterialListLabel");
        ASSET_EDITOR_DIALOG_TITLE = bundle.getString("AssetEditorDialogTitle");
        ASSET_EDITOR_DIALOG_BUTTON_OK = bundle.getString("AssetEditorDialogButtonOk");
        ASSET_EDITOR_DIALOG_BUTTON_CANCEL = bundle.getString("AssetEditorDialogButtonCancel");

        PARTICLE_ASSET_EDITOR_DIALOG_TEXTURE_PARAM_LABEL = bundle.getString("ParticlesAssetEditorDialogTextureParamLabel");
        PARTICLE_ASSET_EDITOR_DIALOG_LIGHTING_TRANSFORM_LABEL = bundle.getString("ParticlesAssetEditorDialogTextureLightingTransformLabel");

        MATERIAL_FILE_EDITOR_TEXTURES_COMPONENT_TITLE = bundle.getString("MaterialFileEditorTexturesComponentTitle");
        MATERIAL_FILE_EDITOR_COLORS_COMPONENT_TITLE = bundle.getString("MaterialFileEditorColorsComponentTitle");
        MATERIAL_FILE_EDITOR_OTHER_COMPONENT_TITLE = bundle.getString("MaterialFileEditorOtherComponentTitle");
        MATERIAL_FILE_EDITOR_RENDER_PARAMS_COMPONENT_TITLE = bundle.getString("MaterialFileEditorRenderParamsComponentTitle");

        TEXTURE_2D_MATERIAL_PARAM_CONTROL_REPEAT = bundle.getString("Texture2DMaterialParamControlRepeat");
        TEXTURE_2D_MATERIAL_PARAM_CONTROL_FLIP = bundle.getString("Texture2DMaterialParamControlFlip");
        TEXTURE_2D_MATERIAL_PARAM_CONTROL_ADD = bundle.getString("Texture2DMaterialParamControlAdd");
        TEXTURE_2D_MATERIAL_PARAM_CONTROL_REMOVE = bundle.getString("Texture2DMaterialParamControlRemove");

        COLOR_MATERIAL_PARAM_CONTROL_REMOVE = bundle.getString("ColorMaterialParamControlRemove");

        MATERIAL_RENDER_STATE_FACE_CULL_MODE = bundle.getString("MaterialRenderStateFaceCullMode");
        MATERIAL_RENDER_STATE_BLEND_MODE = bundle.getString("MaterialRenderStateBlendMode");
        MATERIAL_RENDER_STATE_POLY_OFFSET_FACTOR = bundle.getString("MaterialRenderStatePolyOffsetFactor");
        MATERIAL_RENDER_STATE_POLY_OFFSET_UNITS = bundle.getString("MaterialRenderStatePolyOffsetUnits");
        MATERIAL_RENDER_STATE_POINT_SPRITE = bundle.getString("MaterialRenderStatePointSprite");
        MATERIAL_RENDER_STATE_DEPTH_WRITE = bundle.getString("MaterialRenderStateDepthWrite");
        MATERIAL_RENDER_STATE_COLOR_WRITE = bundle.getString("MaterialRenderStateColorWrite");
        MATERIAL_RENDER_STATE_DEPTH_TEST = bundle.getString("MaterialRenderStateDepthTest");
        MATERIAL_RENDER_STATE_WIREFRAME = bundle.getString("MaterialRenderStateWireframe");

        MATERIAL_EDITOR_MATERIAL_TYPE_LABEL = bundle.getString("MaterialFileEditorMaterialTypeLabel");
        MATERIAL_FILE_EDITOR_BUCKET_TYPE_LABEL = bundle.getString("MaterialFileEditorBucketTypeLabel");

        TEXT_FILE_EDITOR_NAME = bundle.getString("TextFileEditorName");
        POST_FILTER_EDITOR_NAME = bundle.getString("PostFilterEditorName");
        MATERIAL_EDITOR_NAME = bundle.getString("MaterialFileEditorName");

        FILE_CREATOR_BUTTON_OK = bundle.getString("FileCreatorButtonOk");
        FILE_CREATOR_FILE_NAME_LABEL = bundle.getString("FileCreatorFileNameLabel");

        MATERIAL_FILE_CREATOR_TITLE = bundle.getString("MaterialFileCreatorTitle");
        MATERIAL_FILE_CREATOR_MATERIAL_TYPE_LABEL = bundle.getString("MaterialFileCreatorMaterialTypeLabel");
        MATERIAL_FILE_CREATOR_FILE_DESCRIPTION = bundle.getString("MaterialFileCreatorFileDescription");

        SINGLE_COLOR_TEXTURE_FILE_CREATOR_TITLE = bundle.getString("SingleColorTextureFileCreatorTitle");
        SINGLE_COLOR_TEXTURE_FILE_CREATOR_WIDTH = bundle.getString("SingleColorTextureFileCreatorWidth");
        SINGLE_COLOR_TEXTURE_FILE_CREATOR_HEIGHT = bundle.getString("SingleColorTextureFileCreatorHeight");
        SINGLE_COLOR_TEXTURE_FILE_CREATOR_COLOR = bundle.getString("SingleColorTextureFileCreatorColor");
        SINGLE_COLOR_TEXTURE_FILE_CREATOR_DESCRIPTION = bundle.getString("SingleColorTextureFileCreatorDescription");

        POST_FILTER_VIEW_FILE_CREATOR_TITLE = bundle.getString("PostFilterViewFileCreatorTitle");
        POST_FILTER_VIEW_FILE_CREATOR_FILE_DESCRIPTION = bundle.getString("PostFilterViewFileCreatorFileDescription");

        SETTINGS_DIALOG_TITLE = bundle.getString("SettingsDialogTitle");
        SETTINGS_DIALOG_FXAA = bundle.getString("SettingsDialogFXAA");
        SETTINGS_DIALOG_DECORATED = bundle.getString("SettingsDialogDecorated");
        SETTINGS_DIALOG_FRAME_RATE = bundle.getString("SettingsDialogFrameRate");
        SETTINGS_DIALOG_GAMMA_CORRECTION = bundle.getString("SettingsDialogGammaCorrection");
        SETTINGS_DIALOG_TONEMAP_FILTER = bundle.getString("SettingsDialogToneMapFilter");
        SETTINGS_DIALOG_TONEMAP_FILTER_WHITE_POINT = bundle.getString("SettingsDialogToneMapFilterWhitePoint");
        SETTINGS_DIALOG_ANISOTROPY = bundle.getString("SettingsDialogAnisotropy");
        SETTINGS_DIALOG_BUTTON_OK = bundle.getString("SettingsDialogButtonOk");
        SETTINGS_DIALOG_BUTTON_CANCEL = bundle.getString("SettingsDialogButtonCancel");
        SETTINGS_DIALOG_MESSAGE = bundle.getString("SettingsDialogMessage");
        SETTINGS_DIALOG_GOOGLE_ANALYTICS = bundle.getString("SettingsDialogAnalytics");
        SETTINGS_DIALOG_CAMERA_ANGLE = bundle.getString("SettingsDialogCameraAngle");
        SETTINGS_DIALOG_AUTO_TANGENT_GENERATING = bundle.getString("SettingsDialogAutoTangentGenerating");
        SETTINGS_DIALOG_DEFAULT_FLIPPED_TEXTURE = bundle.getString("SettingsDialogUseFlipTexture");
        SETTINGS_DIALOG_DEFAULT_EDITOR_CAMERA_LAMP_ENABLED = bundle.getString("SettingsDialogEditorCameraLampEnabled");
        SETTINGS_DIALOG_TAB_GRAPHICS = bundle.getString("SettingsDialogTabGraphics");
        SETTINGS_DIALOG_TAB_OTHER = bundle.getString("SettingsDialogTabOther");
        SETTINGS_DIALOG_CLASSPATH_FOLDER_LABEL = bundle.getString("SettingsDialogClasspathFolderLabel");
        SETTINGS_DIALOG_CLASSPATH_FOLDER_CHOOSER_TITLE = bundle.getString("SettingsDialogClasspathFolderChooserTitle");
        SETTINGS_DIALOG_ENVS_FOLDER_LABEL = bundle.getString("SettingsDialogEnvsFolderLabel");
        SETTINGS_DIALOG_ENVS_FOLDER_CHOOSER_TITLE = bundle.getString("SettingsDialogEnvsFolderChooserTitle");

        BLEND_TO_J3O_FILE_CONVERTER_DESCRIPTION = bundle.getString("BlendToJ3oFileConverterDescription");
        FBX_TO_J3O_FILE_CONVERTER_DESCRIPTION = bundle.getString("FBXToJ3oFileConverterDescription");
        OBJ_TO_J3O_FILE_CONVERTER_DESCRIPTION = bundle.getString("ObjToJ3oFileConverterDescription");
        SCENE_TO_J3O_FILE_CONVERTER_DESCRIPTION = bundle.getString("SceneToJ3oFileConverterDescription");
        MESH_XML_TO_J3O_FILE_CONVERTER_DESCRIPTION = bundle.getString("MeshXmlToJ3oFileConverterDescription");
        XBUF_TO_J3O_FILE_CONVERTER_DESCRIPTION = bundle.getString("XBufToJ3oFileConverterDescription");

        MODEL_FILE_EDITOR_NAME = bundle.getString("ModelFileEditorName");
        MODEL_FILE_EDITOR_NO_SKY = bundle.getString("ModelFileEditorNoSky");
        MODEL_FILE_EDITOR_FAST_SKY = bundle.getString("ModelFileEditorFastSky");
        MODEL_FILE_EDITOR_NODE_MESH = bundle.getString("ModelFileEditorNodeMesh");
        MODEL_FILE_EDITOR_NODE_AMBIENT_LIGHT = bundle.getString("ModelFileEditorNodeAmbientLight");
        MODEL_FILE_EDITOR_NODE_DIRECTION_LIGHT = bundle.getString("ModelFileEditorNodeDirectionLight");
        MODEL_FILE_EDITOR_NODE_POINT_LIGHT = bundle.getString("ModelFileEditorNodePointLight");
        MODEL_FILE_EDITOR_NODE_SPOT_LIGHT = bundle.getString("ModelFileEditorNodeSpotLight");
        MODEL_FILE_EDITOR_NODE_LIGHT_PROBE = bundle.getString("ModelFileEditorNodeLightProbe");
        MODEL_FILE_EDITOR_NODE_ANIM_CONTROL = bundle.getString("ModelFileEditorNodeAnimControl");
        MODEL_FILE_EDITOR_NODE_EMITTER_INFLUENCERS = bundle.getString("ModelFileEditorNodeEmitterInfluencers");
        MODEL_FILE_EDITOR_NODE_STATIC_RIGID_BODY_CONTROL = bundle.getString("ModelFileEditorNodeStaticRigidBodyControl");
        MODEL_FILE_EDITOR_NODE_RIGID_BODY_CONTROL = bundle.getString("ModelFileEditorNodeRigidBodyControl");
        MODEL_FILE_EDITOR_NODE_CHARACTER_CONTROL = bundle.getString("ModelFileEditorNodeCharacterControl");
        MODEL_FILE_EDITOR_NODE_SKELETON_CONTROL = bundle.getString("ModelFileEditorNodeSkeletonControl");
        MODEL_FILE_EDITOR_NODE_VEHICLE_CONTROL = bundle.getString("ModelFileEditorNodeVehicleControl");
        MODEL_FILE_EDITOR_NODE_RAGDOLL_CONTROL = bundle.getString("ModelFileEditorNodeRagDollControl");
        MODEL_FILE_EDITOR_NODE_BOX_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeBoxCollisionShape");
        MODEL_FILE_EDITOR_NODE_CAPSULE_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeCapsuleCollisionShape");
        MODEL_FILE_EDITOR_NODE_CHILD_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeChildCollisionShape");
        MODEL_FILE_EDITOR_NODE_COMPUTED_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeComputedCollisionShape");
        MODEL_FILE_EDITOR_NODE_CONE_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeConeCollisionShape");
        MODEL_FILE_EDITOR_NODE_CYLINDER_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeCylinderCollisionShape");
        MODEL_FILE_EDITOR_NODE_GIMPACT_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeGImpactCollisionShape");
        MODEL_FILE_EDITOR_NODE_HEIGHT_FIELD_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeHeightFieldCollisionShape");
        MODEL_FILE_EDITOR_NODE_HULL_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeHullCollisionShape");
        MODEL_FILE_EDITOR_NODE_MESH_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeMeshCollisionShape");
        MODEL_FILE_EDITOR_NODE_PLANE_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodePlaneCollisionShape");
        MODEL_FILE_EDITOR_NODE_SPHERE_COLLISION_SHAPE = bundle.getString("ModelFileEditorNodeSphereCollisionShape");
        MODEL_FILE_EDITOR_NODE_WHEEL = bundle.getString("ModelFileEditorNodeWheel");
        MODEL_FILE_EDITOR_NODE_MOTION_CONTROL = bundle.getString("ModelFileEditorNodeMotionControl");
        MODEL_FILE_EDITOR_NODE_MOTION_PATH = bundle.getString("ModelFileEditorNodeMotionPath");
        MODEL_FILE_EDITOR_NODE_WAY_POINT = bundle.getString("ModelFileEditorNodeWayPoint");
        MODEL_FILE_EDITOR_NODE_VERTEX_BUFFER = bundle.getString("ModelFileEditorNodeVertexBuffer");

        SCENE_FILE_EDITOR_NAME = bundle.getString("SceneFileEditorName");
        SCENE_FILE_EDITOR_TOOL_OBJECTS = bundle.getString("SceneFileEditorToolObjects");
        SCENE_FILE_EDITOR_TOOL_EDITING = bundle.getString("SceneFileEditorToolEditing");
        SCENE_FILE_EDITOR_TOOL_APP_STATES = bundle.getString("SceneFileEditorToolAppStates");
        SCENE_FILE_EDITOR_TOOL_FILTERS = bundle.getString("SceneFileEditorToolFilters");
        SCENE_FILE_EDITOR_TOOL_LAYERS = bundle.getString("SceneFileEditorToolLayers");

        MODEL_NODE_TREE_ACTION_REMOVE = bundle.getString("ModelNodeTreeActionRemove");
        MODEL_NODE_TREE_ACTION_RENAME = bundle.getString("ModelNodeTreeActionRename");
        MODEL_NODE_TREE_ACTION_OPTIMIZE_GEOMETRY = bundle.getString("ModelNodeTreeActionOptimizeGeometry");
        MODEL_NODE_TREE_ACTION_TOOLS = bundle.getString("ModelNodeTreeActionTools");
        MODEL_NODE_TREE_ACTION_CREATE = bundle.getString("ModelNodeTreeActionCreate");
        MODEL_NODE_TREE_ACTION_CREATE_NODE = bundle.getString("ModelNodeTreeActionCreateNode");
        MODEL_NODE_TREE_ACTION_CREATE_SKY = bundle.getString("ModelNodeTreeActionCreateSky");
        MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE = bundle.getString("ModelNodeTreeActionCreatePrimitive");
        MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE_BOX = bundle.getString("ModelNodeTreeActionCreatePrimitiveBox");
        MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE_SPHERE = bundle.getString("ModelNodeTreeActionCreatePrimitiveSphere");
        MODEL_NODE_TREE_ACTION_CREATE_PRIMITIVE_QUAD = bundle.getString("ModelNodeTreeActionCreatePrimitiveQuad");
        MODEL_NODE_TREE_ACTION_LOAD_MODEL = bundle.getString("ModelNodeTreeActionLoadModel");
        MODEL_NODE_TREE_ACTION_LINK_MODEL = bundle.getString("ModelNodeTreeActionLinkModel");
        MODEL_NODE_TREE_ACTION_TANGENT_GENERATOR = bundle.getString("ModelNodeTreeActionTangentGenerator");
        MODEL_NODE_TREE_ACTION_LOD_GENERATOR = bundle.getString("ModelNodeTreeActionLoDGenerator");
        MODEL_NODE_TREE_ACTION_LIGHT = bundle.getString("ModelNodeTreeActionLight");
        MODEL_NODE_TREE_ACTION_AMBIENT_LIGHT = bundle.getString("ModelNodeTreeActionAmbientLight");
        MODEL_NODE_TREE_ACTION_DIRECTION_LIGHT = bundle.getString("ModelNodeTreeActionDirectionLight");
        MODEL_NODE_TREE_ACTION_POINT_LIGHT = bundle.getString("ModelNodeTreeActionPointLight");
        MODEL_NODE_TREE_ACTION_SPOT_LIGHT = bundle.getString("ModelNodeTreeActionSpotLight");
        MODEL_NODE_TREE_ACTION_ANIMATION_PLAY = bundle.getString("ModelNodeTreeActionAnimationPlay");
        MODEL_NODE_TREE_ACTION_ANIMATION_PLAY_SETTINGS = bundle.getString("ModelNodeTreeActionAnimationPlaySettings");
        MODEL_NODE_TREE_ACTION_ANIMATION_STOP = bundle.getString("ModelNodeTreeActionAnimationStop");
        MODEL_NODE_TREE_ACTION_ANIMATION_MANUAL_EXTRAXT_SUB_ANIMATION = bundle.getString("ModelNodeTreeActionAnimationManualExtractSubAnimation");
        MODEL_NODE_TREE_ACTION_CREATE_AUDIO_NODE = bundle.getString("ModelNodeTreeActionCreateAudioNode");
        MODEL_NODE_TREE_ACTION_AUDIO_PLAY = bundle.getString("ModelNodeTreeActionAudioPlay");
        MODEL_NODE_TREE_ACTION_AUDIO_STOP = bundle.getString("ModelNodeTreeActionAudioStop");
        MODEL_NODE_TREE_ACTION_CREATE_TEMITTER = bundle.getString("ModelNodeTreeActionCreateTEmitter");
        MODEL_NODE_TREE_ACTION_CREATE_SOFT_TEMITTER = bundle.getString("ModelNodeTreeActionCreateSoftTEmitter");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_TRIANGLE_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeTriangleShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_BOX_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeBoxShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_CYLINDER_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeCylinderShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_DOME_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeDomeShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_QUAD_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeQuadShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_SPHERE_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeSphereShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_TORUS_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeTorusShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_MODEL_SHAPE = bundle.getString("ModelNodeTreeActionEmitterChangeModelShape");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH = bundle.getString("ModelNodeTreeActionEmitterChangeParticlesMesh");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_QUAD = bundle.getString("ModelNodeTreeActionEmitterChangeParticlesMeshQuad");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_POINT = bundle.getString("ModelNodeTreeActionEmitterChangeParticlesMeshPoint");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_IMPOSTOR = bundle.getString("ModelNodeTreeActionEmitterChangeParticlesMeshImpostor");
        MODEL_NODE_TREE_ACTION_EMITTER_CHANGE_PARTICLES_MESH_MODEL = bundle.getString("ModelNodeTreeActionEmitterChangeParticlesMeshModel");
        MODEL_NODE_TREE_ACTION_CREATE_LAYER = bundle.getString("ModelNodeTreeActionCreateLayer");
        MODEL_NODE_TREE_ACTION_ADD_USER_DATA = bundle.getString("ModelNodeTreeActionAddUserData");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL = bundle.getString("ModelNodeTreeActionAddControl");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL_RIGID_BODY = bundle.getString("ModelNodeTreeActionAddControlRigidBody");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL_STATIC_RIGID_BODY = bundle.getString("ModelNodeTreeActionAddControlStaticRigidBody");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL_NOTION = bundle.getString("ModelNodeTreeActionAddControlMotion");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL_CHARACTER = bundle.getString("ModelNodeTreeActionAddControlCharacter");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL_CUSTOM = bundle.getString("ModelNodeTreeActionAddControlCustom");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL_VEHICLE = bundle.getString("ModelNodeTreeActionAddControlVehicle");
        MODEL_NODE_TREE_ACTION_ADD_CONTROL_KINEMATIC_RAGDOLL = bundle.getString("ModelNodeTreeActionAddControlKinematicRagdoll");
        MODEL_NODE_TREE_ACTION_REACTIVATE = bundle.getString("ModelNodeTreeActionReactivate");
        MODEL_NODE_TREE_ACTION_CHANGE_COLLISION_SHAPE = bundle.getString("ModelNodeTreeActionChangeCollisionShape");
        MODEL_NODE_TREE_ACTION_GENERATE_COLLISION_SHAPE = bundle.getString("ModelNodeTreeActionGenerateCollisionShape");
        MODEL_NODE_TREE_ACTION_BOX_COLLISION_SHAPE = bundle.getString("ModelNodeTreeActionBoxCollisionShape");
        MODEL_NODE_TREE_ACTION_CAPSULE_COLLISION_SHAPE = bundle.getString("ModelNodeTreeActionCapsuleCollisionShape");
        MODEL_NODE_TREE_ACTION_CONE_COLLISION_SHAPE = bundle.getString("ModelNodeTreeActionConeCollisionShape");
        MODEL_NODE_TREE_ACTION_CYLINDER_COLLISION_SHAPE = bundle.getString("ModelNodeTreeActionCylinderCollisionShape");
        MODEL_NODE_TREE_ACTION_SPHERE_COLLISION_SHAPE = bundle.getString("ModelNodeTreeActionSphereCollisionShape");
        MODEL_NODE_TREE_ACTION_ADD_WHEEL = bundle.getString("ModelNodeTreeActionAddWheel");
        MODEL_NODE_TREE_ACTION_ADD_TERRAIN = bundle.getString("ModelNodeTreeActionAddTerrain");

        MODEL_PROPERTY_CULL_HINT = bundle.getString("ModelPropertyCullHint");
        MODEL_PROPERTY_SHADOW_MODE = bundle.getString("ModelPropertyShadowMode");
        MODEL_PROPERTY_QUEUE_BUCKET = bundle.getString("ModelPropertyQueueBucket");
        MODEL_PROPERTY_LOCATION = bundle.getString("ModelPropertyLocation");
        MODEL_PROPERTY_SCALE = bundle.getString("ModelPropertyScale");
        MODEL_PROPERTY_ROTATION = bundle.getString("ModelPropertyRotation");
        MODEL_PROPERTY_MATERIAL = bundle.getString("ModelPropertyMaterial");
        MODEL_PROPERTY_DIRECTION = bundle.getString("ModelPropertyDirection");
        MODEL_PROPERTY_RADIUS = bundle.getString("ModelPropertyRadius");
        MODEL_PROPERTY_COLOR = bundle.getString("ModelPropertyColor");
        MODEL_PROPERTY_INNER_ANGLE = bundle.getString("ModelPropertyInnerAngle");
        MODEL_PROPERTY_OUTER_ANGLE = bundle.getString("ModelPropertyOuterAngle");
        MODEL_PROPERTY_MIN = bundle.getString("ModelPropertyMin");
        MODEL_PROPERTY_MAX = bundle.getString("ModelPropertyMax");
        MODEL_PROPERTY_LOOPING = bundle.getString("ModelPropertyLooping");
        MODEL_PROPERTY_REVERB = bundle.getString("ModelPropertyReverb");
        MODEL_PROPERTY_DIRECTIONAL = bundle.getString("ModelPropertyDirectional");
        MODEL_PROPERTY_POSITIONAL = bundle.getString("ModelPropertyPositional");
        MODEL_PROPERTY_AUDIO_PITCH = bundle.getString("ModelPropertyAudioPitch");
        MODEL_PROPERTY_AUDIO_VOLUME = bundle.getString("ModelPropertyAudioVolume");
        MODEL_PROPERTY_TIME_OFFSET = bundle.getString("ModelPropertyTimeOffset");
        MODEL_PROPERTY_MAX_DISTANCE = bundle.getString("ModelPropertyMaxDistance");
        MODEL_PROPERTY_REF_DISTANCE = bundle.getString("ModelPropertyRefDistance");
        MODEL_PROPERTY_AUDIO_DATA = bundle.getString("ModelPropertyAudioData");
        MODEL_PROPERTY_VELOCITY = bundle.getString("ModelPropertyVelocity");
        MODEL_PROPERTY_LOD = bundle.getString("ModelPropertyLoD");
        MODEL_PROPERTY_TRIANGLE_COUNT = bundle.getString("ModelPropertyTriangleCount");
        MODEL_PROPERTY_LEVEL = bundle.getString("ModelPropertyLevel");
        MODEL_PROPERTY_LAYER = bundle.getString("ModelPropertyLayer");
        MODEL_PROPERTY_VALUE = bundle.getString("ModelPropertyValue");
        MODEL_PROPERTY_ID = bundle.getString("ModelPropertyId");
        MODEL_PROPERTY_INSTANCE_COUNT = bundle.getString("ModelPropertyInstanceCount");
        MODEL_PROPERTY_VERTEX_COUNT = bundle.getString("ModelPropertyVertexCount");
        MODEL_PROPERTY_NUM_LOD_LEVELS = bundle.getString("ModelPropertyNumLodLevels");
        MODEL_PROPERTY_MODE = bundle.getString("ModelPropertyMode");
        MODEL_PROPERTY_TYPE = bundle.getString("ModelPropertyType");
        MODEL_PROPERTY_FORMAT = bundle.getString("ModelPropertyFormat");
        MODEL_PROPERTY_USAGE = bundle.getString("ModelPropertyUsage");
        MODEL_PROPERTY_UNIQ_ID = bundle.getString("ModelPropertyUniqId");
        MODEL_PROPERTY_BASE_INSTANCE_COUNT = bundle.getString("ModelPropertyBaseInstanceCount");
        MODEL_PROPERTY_INSTANCE_SPAN = bundle.getString("ModelPropertyInstanceSpan");
        MODEL_PROPERTY_NUM_COMPONENTS = bundle.getString("ModelPropertyNumComponents");
        MODEL_PROPERTY_NUM_ELEMENTS = bundle.getString("ModelPropertyNumElements");
        MODEL_PROPERTY_OFFSET = bundle.getString("ModelPropertyOffset");
        MODEL_PROPERTY_STRIDE = bundle.getString("ModelPropertyStride");
        MODEL_PROPERTY_CAPACITY = bundle.getString("ModelPropertyCapacity");

        CONTROL_PROPERTY_ENABLED = bundle.getString("ControlPropertyEnabled");
        CONTROL_PROPERTY_HARDWARE_SKINNING_PREFERRED = bundle.getString("ControlPropertyHardwareSkinningPreferred");
        CONTROL_PROPERTY_VIEW_DIRECTION = bundle.getString("ControlPropertyViewDirection");
        CONTROL_PROPERTY_WALK_DIRECTION = bundle.getString("ControlPropertyWalkDirection");
        CONTROL_PROPERTY_FALL_SPEED = bundle.getString("ControlPropertyFallSpeed");
        CONTROL_PROPERTY_GRAVITY = bundle.getString("ControlPropertyGravity");
        CONTROL_PROPERTY_JUMP_SPEED = bundle.getString("ControlPropertyJumpSpeed");
        CONTROL_PROPERTY_MAX_SLOPE = bundle.getString("ControlPropertyMaxSlope");
        CONTROL_PROPERTY_APPLY_PHYSICS_LOCAL = bundle.getString("ControlPropertyApplyPhysicsLocal");
        CONTROL_PROPERTY_USE_VIEW_DIRECTION = bundle.getString("ControlPropertyUseViewDirection");
        CONTROL_PROPERTY_KINEMATIC_SPATIAL = bundle.getString("ControlPropertyKinematicSpatial");
        CONTROL_PROPERTY_KINEMATIC = bundle.getString("ControlPropertyKinematic");
        CONTROL_PROPERTY_ANGULAR_VELOCITY = bundle.getString("ControlPropertyAngularVelocity");
        CONTROL_PROPERTY_LINEAR_FACTOR = bundle.getString("ControlPropertyLinearFactor");
        CONTROL_PROPERTY_ANGULAR_DAMPING = bundle.getString("ControlPropertyAngularDamping");
        CONTROL_PROPERTY_ANGULAR_FACTOR = bundle.getString("ControlPropertyAngularFactor");
        CONTROL_PROPERTY_FRICTION = bundle.getString("ControlPropertyFriction");
        CONTROL_PROPERTY_LINEAR_DAMPING = bundle.getString("ControlPropertyLinearDamping");
        CONTROL_PROPERTY_MASS = bundle.getString("ControlPropertyMass");
        CONTROL_PROPERTY_RESTITUTION = bundle.getString("ControlPropertyRestitution");
        CONTROL_PROPERTY_CURRENT_VALUE = bundle.getString("ControlPropertyCurrentValue");
        CONTROL_PROPERTY_CURRENT_WAY_POINT = bundle.getString("ControlPropertyCurrentWayPoint");
        CONTROL_PROPERTY_DIRECTION_TYPE = bundle.getString("ControlPropertyDirectionType");
        CONTROL_PROPERTY_DIRECTION = bundle.getString("ControlPropertyDirection");
        CONTROL_PROPERTY_ROTATION = bundle.getString("ControlPropertyRotation");
        CONTROL_PROPERTY_ANGULAR_SLEEPING_THRESHOLD = bundle.getString("ControlPropertyAngularSleepingThreshold");
        CONTROL_PROPERTY_LOOP_MODE = bundle.getString("ControlPropertyLoopMode");
        CONTROL_PROPERTY_INITIAL_DURATION = bundle.getString("ControlPropertyInitialDuration");
        CONTROL_PROPERTY_SPEED = bundle.getString("ControlPropertySpeed");
        CONTROL_PROPERTY_TIME = bundle.getString("ControlPropertyTime");
        CONTROL_PROPERTY_MARGIN = bundle.getString("ControlPropertyMargin");
        CONTROL_PROPERTY_LOCATION = bundle.getString("ControlPropertyLocation");
        CONTROL_PROPERTY_HALF_EXTENTS = bundle.getString("ControlPropertyHalfExtents");
        CONTROL_PROPERTY_RADIUS = bundle.getString("ControlPropertyRadius");
        CONTROL_PROPERTY_HEIGHT = bundle.getString("ControlPropertyHeight");
        CONTROL_PROPERTY_AXIS = bundle.getString("ControlPropertyAxis");
        CONTROL_PROPERTY_SCALE = bundle.getString("ControlPropertyScale");
        CONTROL_PROPERTY_OBJECT_ID = bundle.getString("ControlPropertyObjectId");
        CONTROL_PROPERTY_AXLE = bundle.getString("ControlPropertyObjectId");
        CONTROL_PROPERTY_REST_LENGTH = bundle.getString("ControlPropertyObjectId");
        CONTROL_PROPERTY_FRONT = bundle.getString("ControlPropertyFront");
        CONTROL_PROPERTY_DAMPING_COMPRESSION = bundle.getString("ControlPropertyDampingCompression");
        CONTROL_PROPERTY_FRICTION_SLIP = bundle.getString("ControlPropertyFrictionSlip");
        CONTROL_PROPERTY_MAX_SUSPENSION_FORCE = bundle.getString("ControlPropertyMaxSuspensionForce");
        CONTROL_PROPERTY_MAX_SUSPENSION_TRAVEL_CM = bundle.getString("ControlPropertyMaxSuspensionTravelCm");
        CONTROL_PROPERTY_DAMPING_RELAXATION = bundle.getString("ControlPropertyDampingRelaxation");
        CONTROL_PROPERTY_SUSPENSION_STIFFNESS = bundle.getString("ControlPropertySuspensionStiffness");
        CONTROL_PROPERTY_ROLL_INFLUENCE = bundle.getString("ControlPropertyRollInfluence");
        CONTROL_PROPERTY_WHEEL_SPATIAL = bundle.getString("ControlPropertyWheelSpatial");

        PARTICLE_EMITTER_TEST_MODE = bundle.getString("ParticleEmitterTestMode");
        PARTICLE_EMITTER_ENABLED = bundle.getString("ParticleEmitterEnabled");
        PARTICLE_EMITTER_RANDOM_POINT = bundle.getString("ParticleEmitterRandomPoint");
        PARTICLE_EMITTER_SEQUENTIAL_FACE = bundle.getString("ParticleEmitterSequentialFace");
        PARTICLE_EMITTER_SKIP_PATTERN = bundle.getString("ParticleEmitterSkipPattern");
        PARTICLE_EMITTER_DIRECTION_TYPE = bundle.getString("ParticleEmitterDirectionType");
        PARTICLE_EMITTER_EMISSION_POINT = bundle.getString("ParticleEmitterEmissionPoint");
        PARTICLE_EMITTER_MAX_PARTICLES = bundle.getString("ParticleEmitterMaxParticles");
        PARTICLE_EMITTER_EMISSION_PER_SECOND = bundle.getString("ParticleEmitterEmissionPerSecond");
        PARTICLE_EMITTER_PARTICLES_PER_SECOND = bundle.getString("ParticleEmitterParticlesPerSecond");
        PARTICLE_EMITTER_EMITTER_LIFE = bundle.getString("ParticleEmitterEmitterLife");
        PARTICLE_EMITTER_TEST_PARTICLES = bundle.getString("ParticleEmitterTestParticles");
        PARTICLE_EMITTER_FOLLOW_EMITTER = bundle.getString("ParticleEmitterFollowEmitter");
        PARTICLE_EMITTER_STRETCHING = bundle.getString("ParticleEmitterStretching");
        PARTICLE_EMITTER_MAGNITUDE = bundle.getString("ParticleEmitterMagnitude");
        PARTICLE_EMITTER_BILLBOARD = bundle.getString("ParticleEmitterBillboard");
        PARTICLE_EMITTER_INITIAL_FORCE = bundle.getString("ParticleEmitterInitialForce");
        PARTICLE_EMITTER_LIFE = bundle.getString("ParticleEmitterLife");
        PARTICLE_EMITTER_COLUMNS = bundle.getString("ParticleEmitterColumns");
        PARTICLE_EMITTER_ROWS = bundle.getString("ParticleEmitterRows");
        PARTICLE_EMITTER_SPRITE_COUNT = bundle.getString("ParticleEmitterSpriteCount");
        PARTICLE_EMITTER_INFLUENCER_FIXED_DURATION = bundle.getString("ParticleEmitterInfluencerFixedDuration");
        PARTICLE_EMITTER_INFLUENCER_RANDOM_START_COLOR = bundle.getString("ParticleEmitterInfluencerRandomStartColor");
        PARTICLE_EMITTER_INFLUENCER_RANDOM_START_SIZE = bundle.getString("ParticleEmitterInfluencerRandomStartSize");
        PARTICLE_EMITTER_INFLUENCER_SIZE_VARIATION_FACTOR = bundle.getString("ParticleEmitterInfluencerSizeVariationFactor");
        PARTICLE_EMITTER_INFLUENCER_RANDOM_START_DESTINATION = bundle.getString("ParticleEmitterInfluencerRandomStartDestination");
        PARTICLE_EMITTER_INFLUENCER_CHANCE = bundle.getString("ParticleEmitterInfluencerChance");
        PARTICLE_EMITTER_INFLUENCER_STRENGTH = bundle.getString("ParticleEmitterInfluencerStrength");
        PARTICLE_EMITTER_INFLUENCER_MAGNITUDE = bundle.getString("ParticleEmitterInfluencerMagnitude");
        PARTICLE_EMITTER_INFLUENCER_GRAVITY = bundle.getString("ParticleEmitterInfluencerGravity");
        PARTICLE_EMITTER_INFLUENCER_ALIGNMENT = bundle.getString("ParticleEmitterInfluencerAlignment");
        PARTICLE_EMITTER_INFLUENCER_RANDOM_DIRECTION = bundle.getString("ParticleEmitterInfluencerRandomDirection");
        PARTICLE_EMITTER_INFLUENCER_PULL_CENTER = bundle.getString("ParticleEmitterInfluencerPullCenter");
        PARTICLE_EMITTER_INFLUENCER_PULL_ALIGNMENT = bundle.getString("ParticleEmitterInfluencerPullAlignment");
        PARTICLE_EMITTER_INFLUENCER_UP_ALIGNMENT = bundle.getString("ParticleEmitterInfluencerUpAlignment");
        PARTICLE_EMITTER_INFLUENCER_RADIAL_PULL = bundle.getString("ParticleEmitterInfluencerRadialPull");
        PARTICLE_EMITTER_INFLUENCER_TANGENT_FORCE = bundle.getString("ParticleEmitterInfluencerTangetForce");
        PARTICLE_EMITTER_INFLUENCER_ALPHA_INTERPOLATION = bundle.getString("ParticleEmitterInfluencerAlphaInterpolation");
        PARTICLE_EMITTER_INFLUENCER_COLOR_INTERPOLATION = bundle.getString("ParticleEmitterInfluencerColorInterpolation");
        PARTICLE_EMITTER_INFLUENCER_DESTINATION_INTERPOLATION = bundle.getString("ParticleEmitterInfluencerDestinationInterpolation");
        PARTICLE_EMITTER_INFLUENCER_ROTATION_INTERPOLATION = bundle.getString("ParticleEmitterInfluencerRotationInterpolation");
        PARTICLE_EMITTER_INFLUENCER_SIZE_INTERPOLATION = bundle.getString("ParticleEmitterInfluencerSizeInterpolation");
        PARTICLE_EMITTER_INFLUENCER_ALPHA = bundle.getString("ParticleEmitterInfluencerAlpha");
        PARTICLE_EMITTER_INFLUENCER_COLOR = bundle.getString("ParticleEmitterInfluencerColor");
        PARTICLE_EMITTER_INFLUENCER_SPEED = bundle.getString("ParticleEmitterInfluencerSpeed");
        PARTICLE_EMITTER_INFLUENCER_SIZE = bundle.getString("ParticleEmitterInfluencerSize");
        PARTICLE_EMITTER_INFLUENCER_FRAME_SEQUENCE = bundle.getString("ParticleEmitterInfluencerFrameSequence");
        PARTICLE_EMITTER_INFLUENCER_RANDOM_START_IMAGE = bundle.getString("ParticleEmitterInfluencerRandomStartImage");
        PARTICLE_EMITTER_INFLUENCER_ANIMATE = bundle.getString("ParticleEmitterInfluencerAnimate");
        PARTICLE_EMITTER_INFLUENCER_REACTION = bundle.getString("ParticleEmitterInfluencerReaction");
        PARTICLE_EMITTER_INFLUENCER_RESTITUTION = bundle.getString("ParticleEmitterInfluencerRestitution");
        PARTICLE_EMITTER_INFLUENCER_RANDOM_SPEED = bundle.getString("ParticleEmitterInfluencerRandomSpeed");
        PARTICLE_EMITTER_INFLUENCER_START_RANDOM_ROTATION_X = bundle.getString("ParticleEmitterInfluencerStartRandomRotationX");
        PARTICLE_EMITTER_INFLUENCER_INTERPOLATION = bundle.getString("ParticleEmitterInfluencerInterpolation");
        PARTICLE_EMITTER_INFLUENCER_GEOMETRY_LIST = bundle.getString("ParticleEmitterInfluencerGeometryList");
        PARTICLE_EMITTER_INFLUENCER_GEOMETRY = bundle.getString("ParticleEmitterInfluencerGeometry");

        MATERIAL_MODEL_PROPERTY_CONTROL_NO_TEXTURE = bundle.getString("MaterialModelPropertyControlNoTexture");
        MATERIAL_MODEL_PROPERTY_CONTROL_NO_MATERIAL = bundle.getString("MaterialModelPropertyControlNoMaterial");
        ABSTRACT_ELEMENT_PROPERTY_CONTROL_NO_ELEMENT = bundle.getString("AbstractElementPropertyControlNoElement");
        LAYER_PROPERTY_CONTROL_NO_LAYER = bundle.getString("LayerPropertyControlNoLayer");
        AUDIO_KEY_PROPERTY_CONTROL_NO_AUDIO = bundle.getString("AudioKeyPropertyControlNoAudio");
        CHOOSE_FOLDER_CONTROL_NO_FOLDER = bundle.getString("ChooseFolderControlNoFolder");

        RENAME_DIALOG_TITLE = bundle.getString("RenameDialogTitle");
        RENAME_DIALOG_NEW_NAME_LABEL = bundle.getString("RenameDialogNewNameLabel");
        RENAME_DIALOG_BUTTON_OK = bundle.getString("RenameDialogButtonOk");
        RENAME_DIALOG_BUTTON_CANCEL = bundle.getString("RenameDialogButtonCancel");

        PLAY_ANIMATION_SETTINGS_DIALOG_TITLE = bundle.getString("PlayAnimationSettingsDialogTitle");
        PLAY_ANIMATION_SETTINGS_DIALOG_LOOP_MODE = bundle.getString("PlayAnimationSettingsDialogLoopMode");
        PLAY_ANIMATION_SETTINGS_DIALOG_SPEED = bundle.getString("PlayAnimationSettingsDialogSpeed");
        PLAY_ANIMATION_SETTINGS_DIALOG_BUTTON_OK = bundle.getString("PlayAnimationSettingsDialogButtonOk");

        MANUAL_EXTRACT_ANIMATION_DIALOG_TITLE = bundle.getString("ManualExtractAnimationDialogTitle");
        MANUAL_EXTRACT_ANIMATION_DIALOG_NAME = bundle.getString("ManualExtractAnimationDialogName");
        MANUAL_EXTRACT_ANIMATION_DIALOG_NAME_EXAMPLE = bundle.getString("ManualExtractAnimationDialogNameExample");
        MANUAL_EXTRACT_ANIMATION_DIALOG_START_FRAME = bundle.getString("ManualExtractAnimationDialogStartFrame");
        MANUAL_EXTRACT_ANIMATION_DIALOG_END_FRAME = bundle.getString("ManualExtractAnimationDialogEndFrame");
        MANUAL_EXTRACT_ANIMATION_DIALOG_BUTTON_OK = bundle.getString("ManualExtractAnimationDialogButtonOk");

        QUESTION_DIALOG_TITLE = bundle.getString("QuestionDialogTitle");
        QUESTION_DIALOG_BUTTON_OK = bundle.getString("QuestionDialogButtonOk");
        QUESTION_DIALOG_BUTTON_CANCEL = bundle.getString("QuestionDialogButtonCancel");

        FOLDER_CREATOR_DESCRIPTION = bundle.getString("FolderCreatorDescription");
        FOLDER_CREATOR_TITLE = bundle.getString("FolderCreatorTitle");
        FOLDER_CREATOR_FILE_NAME_LABEL = bundle.getString("FolderCreatorFileNameLabel");

        EMPTY_FILE_CREATOR_DESCRIPTION = bundle.getString("EmptyFileCreatorDescription");
        EMPTY_FILE_CREATOR_TITLE = bundle.getString("EmptyFileCreatorTitle");

        IMAGE_VIEWER_EDITOR_NAME = bundle.getString("ImageViewerEditorName");

        AUDIO_VIEWER_EDITOR_NAME = bundle.getString("AudioViewerEditorName");
        AUDIO_VIEWER_EDITOR_DURATION_LABEL = bundle.getString("AudioViewerEditorDurationLabel");
        AUDIO_VIEWER_EDITOR_BITS_PER_SAMPLE_LABEL = bundle.getString("AudioViewerEditorBitsPerSampleLabel");
        AUDIO_VIEWER_EDITOR_CHANNELS_LABEL = bundle.getString("AudioViewerEditorChannelsLabel");
        AUDIO_VIEWER_EDITOR_DATA_TYPE_LABEL = bundle.getString("AudioViewerEditorDataTypeLabel");
        AUDIO_VIEWER_EDITOR_SAMPLE_RATE_LABEL = bundle.getString("AudioViewerEditorSampleRateLabel");

        CREATE_SKY_DIALOG_TITLE = bundle.getString("CreateSkyDialogTitle");
        CREATE_SKY_DIALOG_SKY_TYPE_SINGLE = bundle.getString("CreateSkyDialogSkyTypeSingle");
        CREATE_SKY_DIALOG_SKY_TYPE_MULTIPLE = bundle.getString("CreateSkyDialogSkyTypeMultiple");
        CREATE_SKY_DIALOG_SKY_TYPE_LABEL = bundle.getString("CreateSkyDialogSkyTypeLabel");
        CREATE_SKY_DIALOG_NORMAL_SCALE_LABEL = bundle.getString("CreateSkyDialogNormalScaleLabel");
        CREATE_SKY_DIALOG_TEXTURE_LABEL = bundle.getString("CreateSkyDialogTextureLabel");
        CREATE_SKY_DIALOG_TEXTURE_TYPE_LABEL = bundle.getString("CreateSkyDialogTextureTypeLabel");
        CREATE_SKY_DIALOG_FLIP_Y_LABEL = bundle.getString("CreateSkyDialogFlipYLabel");
        CREATE_SKY_DIALOG_NORTH_LABEL = bundle.getString("CreateSkyDialogNorthLabel");
        CREATE_SKY_DIALOG_SOUTH_LABEL = bundle.getString("CreateSkyDialogSouthLabel");
        CREATE_SKY_DIALOG_EAST_LABEL = bundle.getString("CreateSkyDialogEastLabel");
        CREATE_SKY_DIALOG_WEST_LABEL = bundle.getString("CreateSkyDialogWestLabel");
        CREATE_SKY_DIALOG_TOP_LABEL = bundle.getString("CreateSkyDialogTopLabel");
        CREATE_SKY_DIALOG_BOTTOM_LABEL = bundle.getString("CreateSkyDialogBottomLabel");

        SIMPLE_DIALOG_BUTTON_OK = bundle.getString("SimpleDialogButtonOk");
        SIMPLE_DIALOG_BUTTON_CANCEL = bundle.getString("SimpleDialogButtonCancel");

        EMPTY_MODEL_CREATOR_DESCRIPTION = bundle.getString("EmptyModelCreatorDescription");
        EMPTY_MODEL_CREATOR_TITLE = bundle.getString("EmptyModelCreatorTitle");

        EMPTY_SCENE_CREATOR_DESCRIPTION = bundle.getString("EmptySceneCreatorDescription");
        EMPTY_SCENE_CREATOR_TITLE = bundle.getString("EmptySceneCreatorTitle");

        GLSL_FILE_EDITOR_NAME = bundle.getString("GLSLFileEditorName");
        MATERIAL_DEFINITION_FILE_EDITOR_NAME = bundle.getString("MaterialDefinitionFileEditorName");

        GENERATE_TANGENTS_DIALOG_TITLE = bundle.getString("GenerateTangentsDialogTitle");
        GENERATE_TANGENTS_DIALOG_ALGORITHM_LABEL = bundle.getString("GenerateTangentsDialogAlgorithmLabel");
        GENERATE_TANGENTS_DIALOG_SPLIT_MIRRORED = bundle.getString("GenerateTangentsDialogSplitMirrored");
        GENERATE_TANGENTS_DIALOG_BUTTON_OK = bundle.getString("GenerateTangentsDialogButtonOk");

        GENERATE_LOD_DIALOG_TITLE = bundle.getString("GenerateLoDDialogTitle");
        GENERATE_LOD_DIALOG_METHOD = bundle.getString("GenerateLoDDialogMethod");
        GENERATE_LOD_DIALOG_BUTTON_GENERATE = bundle.getString("GenerateLoDDialogButtonGenerate");

        BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_NAME = bundle.getString("BoundingVolumeModelPropertyControlName");
        BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_SPHERE = bundle.getString("BoundingVolumeModelPropertyControlSphere");
        BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_SPHERE_RADIUS = bundle.getString("BoundingVolumeModelPropertyControlSphereRadius");
        BOUNDING_VOLUME_MODEL_PROPERTY_CONTROL_BOX = bundle.getString("BoundingVolumeModelPropertyControlBox");

        NODE_SELECTOR_DIALOG_TITLE = bundle.getString("NodeSelectorDialogTitle");
        NODE_SELECTOR_DIALOG_BUTTON = bundle.getString("NodeSelectorDialogButton");

        GEOMETRY_SELECTOR_DIALOG_TITLE = bundle.getString("GeometrySelectorDialogTitle");
        LIGHT_SELECTOR_DIALOG_TITLE = bundle.getString("LightSelectorDialogTitle");

        LOG_VIEW_TITLE = bundle.getString("LogViewTitle");

        CREATE_SCENE_APP_STATE_DIALOG_TITLE = bundle.getString("CreateSceneAppStateDialogTitle");
        CREATE_SCENE_APP_STATE_DIALOG_BUILT_IN = bundle.getString("CreateSceneAppStateDialogBuiltIn");
        CREATE_SCENE_APP_STATE_DIALOG_CUSTOM_BOX = bundle.getString("CreateSceneAppStateDialogCustomBox");
        CREATE_SCENE_APP_STATE_DIALOG_CUSTOM_FIELD = bundle.getString("CreateSceneAppStateDialogCustomField");

        CREATE_SCENE_FILTER_DIALOG_TITLE = bundle.getString("CreateSceneFilterDialogTitle");
        CREATE_SCENE_FILTER_DIALOG_BUILT_IN = bundle.getString("CreateSceneFilterDialogBuiltIn");
        CREATE_SCENE_FILTER_DIALOG_CUSTOM_BOX = bundle.getString("CreateSceneFilterDialogCustomBox");
        CREATE_SCENE_FILTER_DIALOG_CUSTOM_FIELD = bundle.getString("CreateSceneFilterDialogCustomField");

        ADD_USER_DATA_DIALOG_TITLE = bundle.getString("AddUserDataDialogTitle");
        ADD_USER_DATA_DIALOG_NAME = bundle.getString("AddUserDataDialogName");
        ADD_USER_DATA_DIALOG_DATA_TYPE = bundle.getString("AddUserDataDialogDataType");
        ADD_USER_DATA_DIALOG_BUTTON_OK = bundle.getString("AddUserDataDialogButtonOk");

        CREATE_CUSTOM_CONTROL_DIALOG_TITLE = bundle.getString("CreateCustomControlDialogTitle");
        CREATE_CUSTOM_CONTROL_DIALOG_BUILT_IN = bundle.getString("CreateCustomControlDialogBuiltIn");
        CREATE_CUSTOM_CONTROL_DIALOG_CUSTOM_BOX = bundle.getString("CreateCustomControlDialogCustomBox");
        CREATE_CUSTOM_CONTROL_DIALOG_CUSTOM_FIELD = bundle.getString("CreateCustomControlDialogCustomField");

        ANALYTICS_CONFIRM_DIALOG_MESSAGE = bundle.getString("AnalyticsConfirmDialogMessage");

        CREATE_BOX_COLLISION_SHAPE_DIALOG_TITLE = bundle.getString("CreateBoxCollisionShapeDialogTitle");
        CREATE_SPHERE_COLLISION_SHAPE_DIALOG_TITLE = bundle.getString("CreateSphereCollisionShapeDialogTitle");
        CREATE_CYLINDER_COLLISION_SHAPE_DIALOG_TITLE = bundle.getString("CreateCylinderCollisionShapeDialogTitle");
        CREATE_CONE_COLLISION_SHAPE_DIALOG_TITLE = bundle.getString("CreateConeCollisionShapeDialogTitle");
        CREATE_CAPSULE_COLLISION_SHAPE_DIALOG_TITLE = bundle.getString("CreateCapsuleCollisionShapeDialogTitle");
        ADD_VEHICLE_WHEEL_DIALOG_TITLE = bundle.getString("AddVehicleWheelDialogTitle");

        CREATE_TERRAIN_DIALOG_TITLE = bundle.getString("CreateTerrainDialogTitle");
        CREATE_TERRAIN_DIALOG_BASE_TEXTURE = bundle.getString("CreateTerrainDialogBaseTexture");
        CREATE_TERRAIN_DIALOG_FOLDER_ALPHA_TEXTURE = bundle.getString("CreateTerrainDialogFolderAlphaTexture");
        CREATE_TERRAIN_DIALOG_TOTAL_SIZE = bundle.getString("CreateTerrainDialogTotalSize");
        CREATE_TERRAIN_DIALOG_PATCH_SIZE = bundle.getString("CreateTerrainDialogPatchSize");
        CREATE_TERRAIN_DIALOG_ALPHA_BLEND_TEXTURE_SIZE = bundle.getString("CreateTerrainDialogAlphaBlendTextureSize");
        CREATE_TERRAIN_DIALOG_TERRAIN_TYPE = bundle.getString("CreateTerrainDialogTerrainType");
        CREATE_TERRAIN_DIALOG_TERRAIN_TYPE_FLAT = bundle.getString("CreateTerrainDialogTerrainTypeFlat");
        CREATE_TERRAIN_DIALOG_TERRAIN_TYPE_IMAGE_BASED = bundle.getString("CreateTerrainDialogTerrainTypeImageBased");
        CREATE_TERRAIN_DIALOG_TERRAIN_TYPE_HILL = bundle.getString("CreateTerrainDialogTerrainTypeHill");
        CREATE_TERRAIN_DIALOG_HEIGHT_MAP_IMAGE = bundle.getString("CreateTerrainDialogHeightMapImage");
        CREATE_TERRAIN_DIALOG_HEIGHT_SMOOTH = bundle.getString("CreateTerrainDialogHeightSmooth");
        CREATE_TERRAIN_DIALOG_HEIGHT_SCALE = bundle.getString("CreateTerrainDialogHeightScale");
        CREATE_TERRAIN_DIALOG_ITERATIONS = bundle.getString("CreateTerrainDialogIterations");
        CREATE_TERRAIN_DIALOG_FLATTENING = bundle.getString("CreateTerrainDialogFlattening");
        CREATE_TERRAIN_DIALOG_MIN_RADIUS = bundle.getString("CreateTerrainDialogMinRadius");
        CREATE_TERRAIN_DIALOG_MAX_RADIUS = bundle.getString("CreateTerrainDialogMaxRadius");

        EDITING_COMPONENT_BRUSH_SIZE = bundle.getString("EditingComponentBrushSize");
        EDITING_COMPONENT_BRUSH_POWER = bundle.getString("EditingComponentBrushPower");
        EDITING_COMPONENT_SMOOTHLY = bundle.getString("EditingComponentSmoothly");
        EDITING_COMPONENT_LIMITED = bundle.getString("EditingComponentLimited");
        EDITING_COMPONENT_USE_MARKER = bundle.getString("EditingComponentUseMarker");
        EDITING_COMPONENT_LEVEL = bundle.getString("EditingComponentLevel");
        EDITING_COMPONENT_ROUGHNESS = bundle.getString("EditingComponentRoughness");
        EDITING_COMPONENT_FREQUENCY = bundle.getString("EditingComponentFrequency");
        EDITING_COMPONENT_LACUNARITY = bundle.getString("EditingComponentLacunarity");
        EDITING_COMPONENT_OCTAVES = bundle.getString("EditingComponentOctaves");
        EDITING_COMPONENT_SCALE = bundle.getString("EditingComponentScale");
        EDITING_COMPONENT_TRI_PLANAR = bundle.getString("EditingComponentTriPlanar");
        EDITING_COMPONENT_SHININESS = bundle.getString("EditingComponentShininess");
        EDITING_COMPONENT_LAYER = bundle.getString("EditingComponentLayer");

        MODEL_CONVERTER_DIALOG_TITLE = bundle.getString("ModelConverterDialogTitle");
        MODEL_CONVERTER_DIALOG_RESULT_NAME = bundle.getString("ModelConverterDialogResultName");
        MODEL_CONVERTER_DIALOG_DESTINATION_FOLDER = bundle.getString("ModelConverterDialogDestinationFolder");
        MODEL_CONVERTER_DIALOG_EXPORT_MATERIALS = bundle.getString("ModelConverterDialogExportMaterials");
        MODEL_CONVERTER_DIALOG_MATERIAL_FOLDER = bundle.getString("ModelConverterDialogMaterialsFolder");
        MODEL_CONVERTER_DIALOG_OVERWRITE_MATERIALS = bundle.getString("ModelConverterDialogOverwriteMaterials");
        MODEL_CONVERTER_DIALOG_BUTTON_OK = bundle.getString("ModelConverterDialogButtonOk");

        FILE_DELETE_HANDLER_DELETE_MATERIALS = bundle.getString("FileDeleteHandlerDeleteMaterials");
    }
}