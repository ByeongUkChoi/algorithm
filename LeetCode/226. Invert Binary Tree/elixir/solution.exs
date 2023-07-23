# Definition for a binary tree node.
#
# defmodule TreeNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           left: TreeNode.t() | nil,
#           right: TreeNode.t() | nil
#         }
#   defstruct val: 0, left: nil, right: nil
# end

defmodule Solution do
  @spec invert_tree(root :: TreeNode.t() | nil) :: TreeNode.t() | nil
  def invert_tree(nil) do
    nil
  end

  def invert_tree(root) do
    struct(root, left: invert_tree(root.right), right: invert_tree(root.left))
  end
end
